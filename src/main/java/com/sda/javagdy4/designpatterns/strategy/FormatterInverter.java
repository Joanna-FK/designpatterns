package com.sda.javagdy4.designpatterns.strategy;

public class FormatterInverter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<tekstDoZamiany.length(); i++){
            if(Character.isLowerCase(tekstDoZamiany.charAt(i))){
               //zamiana na wielką literę
                builder.append(Character.toUpperCase(tekstDoZamiany.charAt(i)));
            }else if (Character.isUpperCase(tekstDoZamiany.charAt(i))){
               //zamiana na małą literę
                builder.append(Character.toLowerCase(tekstDoZamiany.charAt(i)));
            }else {
                //przepisujemy znak
                builder.append(tekstDoZamiany.charAt(i));
            }
        }
        return builder.toString();
    }
}
