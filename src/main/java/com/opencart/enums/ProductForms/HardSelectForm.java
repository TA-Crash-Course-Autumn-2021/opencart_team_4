package com.opencart.enums.ProductForms;

public enum HardSelectForm {
    RED("4"), BLUE("3"), GREEN("1"), YELLOW("2");

    private final String value;

    HardSelectForm(String value) { this.value = value; }

    public String getValue(){ return value; }
}
