package com.sda.javagdy4.designpatterns.strategy;

public class FormatterLower implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.toLowerCase();
    }
}
