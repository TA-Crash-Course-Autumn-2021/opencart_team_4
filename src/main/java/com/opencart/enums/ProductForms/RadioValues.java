package com.opencart.enums.ProductForms;

import com.gargoylesoftware.htmlunit.javascript.host.event.GamepadEvent;

public enum RadioValues {
    SMALL("5"), MEDIUM("6"), LARGE("7");

    private final String value;

    RadioValues(String value) {this.value = value; }

    public String getValue() { return value; }
}
