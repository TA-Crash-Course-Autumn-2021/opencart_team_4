package com.opencart.enums.ProductForms;

public enum HardCheckbox {
    CHECKBOX1("8"), CHECKBOX2("9"), CHECKBOX3("10"), CHECKBOX4("11");

    private final String value;

    HardCheckbox(String value) { this.value = value; }

    public String getValue() { return value; }
}
