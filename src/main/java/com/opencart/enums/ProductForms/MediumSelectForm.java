package com.opencart.enums.ProductForms;



public enum MediumSelectForm {
    RED("15"), BLUE("16");

    private final String value;

    MediumSelectForm(String value){this.value = value; }

    public String getValue() { return value; }
}
