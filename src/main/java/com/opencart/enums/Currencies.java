package com.opencart.enums;

public enum Currencies {
    EURO("EUR","€"), DOLLAR("USD","$"), POUND("GBP", "£"), HRYVNIA("UAH","₴");

    private final String currency;
    private final String symbol;

    Currencies(String currency, String symbol) {
        this.currency = currency;
        this.symbol = symbol;
    }

    public String getCurrency() { return currency; }

    public String getSymbol() { return symbol; }
}
