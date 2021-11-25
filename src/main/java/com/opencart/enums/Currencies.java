package com.opencart.enums;

public enum Currencies {
    EURO("EUR"), DOLLAR("USD"), POUND("GBP"), HRYVNIA("UAH");

    private final String currency;

    Currencies(String currency) { this.currency = currency; }

    public String getCurrency() { return currency; }
}
