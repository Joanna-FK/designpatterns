package com.sda.javagdy4.designpatterns.abstractfactory.zad1;

public class SamsungPC extends AbstractPC {
    public SamsungPC(String computerName, ComputerBrand computerBrand, int cpuPowder, Double gpuPowder, boolean isOverclocked) {
        super(computerName, computerBrand, cpuPowder, gpuPowder, isOverclocked);
    }

    public static AbstractPC createSamsung900(){
        return new SamsungPC("Samsung 900X3C", ComputerBrand.SAMSUNG, 88, 0.95, false);

    }
    public static AbstractPC createSamsungNP(){
        return new SamsungPC("Samsung NP350V5C", ComputerBrand.SAMSUNG, 90, 0.96, false);

    }
}
