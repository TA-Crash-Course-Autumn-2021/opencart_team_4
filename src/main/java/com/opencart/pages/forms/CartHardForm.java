package com.opencart.pages.forms;


import com.opencart.driver.DriverRepository;
import com.opencart.enums.ProductForms.HardCheckbox;
import com.opencart.enums.ProductForms.HardSelectForm;
import com.opencart.enums.ProductForms.RadioValues;
import com.opencart.pages.ProductPage;
import com.opencart.steps.ProductPageBL;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CartHardForm extends ProductPageBL {

    private ProductPage productPage;

    public CartHardForm() { productPage = new ProductPage(); }

    public CartHardForm radioForm(String value) {
        for(WebElement radioValue : productPage.getRadioValues()){
            if(radioValue.getAttribute("value").contains(value)){
                radioValue.click();
            }
        }
        return this;
    }

    public CartHardForm checkBox(String value) {
        for(WebElement checkBox : productPage.getCheckboxOptions()){
            if(checkBox.getAttribute("value").contains(value)){
                checkBox.click();
            }
        }
        return this;
    }

    public CartHardForm selectForm(String value) {
        Select option = new Select(productPage.getSelectOptions());
        option.selectByValue(value);
        return this;
    }

    public CartHardForm hardFormSetText(String text) {
        productPage.getProductHardFormText().clear();
        productPage.getProductHardFormText().sendKeys(text);
        return this;
    }

    public CartHardForm hardFormSetTextArea(String text) {
        productPage.getProductHardFormTextArea().clear();
        productPage.getProductHardFormTextArea().sendKeys(text);
        return this;
    }

    public CartHardForm hardFormSetDate() {
        productPage.getProductHardFormDate().clear();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        String currentDate = format.format(date);
        productPage.getProductHardFormDate().sendKeys(currentDate);
        return this;
    }

    public CartHardForm hardFormSetHour() {
        productPage.getProductHardFormHour().clear();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date = new Date(System.currentTimeMillis());
        String currentHour = format.format(date);
        productPage.getProductHardFormHour().sendKeys(currentHour);
        return this;
    }

    public CartHardForm hardFormSetDateAndHour() {
        productPage.getProductHardFormDateAndHour().clear();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(System.currentTimeMillis());
        String dateAndHour = format.format(date);
        productPage.getProductHardFormDateAndHour().sendKeys(dateAndHour);
        return this;
    }

    public CartHardForm hardFormUploadFile() throws AWTException {
        Robot robot = new Robot();
        productPage.getProductHardFormUploadButton().click();
        robot.delay(7000);
        String filePath = this.getClass().getResource("/testdata/" + "TestFile.txt").getPath();
        StringSelection path = new StringSelection(new File(filePath).getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        return this;
    }

    public CartHardForm cartHardFormAlertAccept() {
        try {
            Alert alert = (new WebDriverWait(DriverRepository.DRIVERS.get(), 30).until(ExpectedConditions.alertIsPresent()));
            DriverRepository.DRIVERS.get().switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Alert is not present");
        }
        return this;
    }

    public CartHardForm hardFormTemplate() throws AWTException {
                checkBox(HardCheckbox.CHECKBOX1.getValue())
                .hardFormSetText("Standard template")
                .selectForm(HardSelectForm.RED.getValue())
                .radioForm(RadioValues.MEDIUM.getValue())
                .hardFormSetTextArea("Valid add to cart test")
                .hardFormSetDate()
                .hardFormSetHour()
                .hardFormSetDateAndHour()
                .hardFormUploadFile()
                .cartHardFormAlertAccept()
                .addToCart()
                .successfulProductAdding();
        return this;
    }
}
