package com.opencart.pages.Forms;


import com.opencart.driver.DriverRepository;
import com.opencart.pages.ProductPage;
import com.opencart.steps.ProductPageBL;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CartHardForm extends ProductPageBL {

    private ProductPage productPage;

    public CartHardForm() { productPage = new ProductPage(); }

    public CartHardForm radioSelectSmall() {
        productPage.getRadioSmall().click();
        return this;
    }

    public CartHardForm radioSelectMedium() {
        productPage.getRadioMedium().click();
        return this;
    }

    public CartHardForm radioSelectLarge() {
        productPage.getRadioLarge().click();
        return this;
    }

    public CartHardForm hardFormSetText(String text) {
        productPage.getProductHardFormText().clear();
        productPage.getProductHardFormText().sendKeys(text);
        return this;
    }

    public CartHardForm checkboxSelectFirst() {
        productPage.getCheckBoxSelectFirst().click();
        return this;
    }

     public CartHardForm checkboxSelectSecond() {
        productPage.getCheckBoxSelectSecond().click();
        return this;
    }

     public CartHardForm checkboxSelectThird() {
        productPage.getCheckBoxSelectThird().click();
        return this;
    }

     public CartHardForm checkboxSelectForth() {
        productPage.getCheckBoxSelectForth().click();
        return this;
    }

    public CartHardForm selectRed() {
        productPage.getSelectForm().click();
        productPage.getSelectRed().click();
        return this;
    }

    public CartHardForm selectBlue() {
        productPage.getSelectForm().click();
        productPage.getSelectBlue().click();
        return this;
    }

    public CartHardForm selectGreen() {
        productPage.getSelectForm().click();
        productPage.getSelectGreen().click();
        return this;
    }

    public CartHardForm selectYellow() {
        productPage.getSelectForm().click();
        productPage.getSelectYellow().click();
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

    public CartHardForm hardFormUploadFile() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        productPage.getProductHardFormUploadButton().click();
        Thread.sleep(4000);
        StringSelection path = new StringSelection("C:\\Users\\Sviatoslav\\Desktop\\IT\\Study\\Framework\\OpenCart\\files\\TestFile.txt");
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
            Alert alert = (new WebDriverWait(DriverRepository.DRIVERS.get(), 20).until(ExpectedConditions.alertIsPresent()));
            DriverRepository.DRIVERS.get().switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Alert is not present");
        }
        return this;
    }

    public CartHardForm hardFormTemplate() throws InterruptedException, AWTException {
                    radioSelectMedium()
                .checkboxSelectForth()
                .hardFormSetText("Standard template")
                .selectYellow()
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
