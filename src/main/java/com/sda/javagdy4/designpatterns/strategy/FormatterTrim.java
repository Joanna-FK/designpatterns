package com.sda.javagdy4.designpatterns.strategy;

public class FormatterTrim implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.trim(); //obcina spacje na początku i na końcu

    }
}
