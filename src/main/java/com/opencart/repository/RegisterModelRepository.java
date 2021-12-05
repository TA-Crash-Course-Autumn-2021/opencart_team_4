package com.opencart.repository;

import com.opencart.datamodel.RegisterModel;
import com.opencart.steps.LoginPageBL;
import org.apache.commons.lang3.RandomStringUtils;


public class RegisterModelRepository {

    private static final String randomPassword = RandomStringUtils.randomAlphabetic(7);
    private static final String randomEmail = RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
    private static  String newPassword;
    private String validUserPassword;

    public RegisterModelRepository() {
    }

    public static RegisterModel getInvalidRegisterModel() {
        String password = RandomStringUtils.randomAlphabetic(7);
        String confirmPassword = RandomStringUtils.randomAlphabetic(7);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(password)
                .passwordConfirm(confirmPassword)
                .build();
    }

    public static RegisterModel getValidModel() {
        String password = "6655566";
        return RegisterModel.getBuilder()
                .firstName("Crashcourse")
                .lastName("Pupkin")
                .email("pupkin@gmail.com")
                .telephone("+38056445676")
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getNewRandomRegisterModel() {
        LoginPageBL.setRandomEmail(randomEmail);
        LoginPageBL.setRandomPassword(randomPassword);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(randomEmail)
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(randomPassword)
                .passwordConfirm(randomPassword)
                .build();
    }

    public void setValidUserPassword(String validUserPassword) { this.validUserPassword = validUserPassword;}

    public static void setNewPassword(String newPassword) { RegisterModelRepository.newPassword = newPassword; }
}
