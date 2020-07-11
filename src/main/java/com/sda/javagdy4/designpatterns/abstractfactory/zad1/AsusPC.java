package com.sda.javagdy4.designpatterns.abstractfactory.zad1;

public class AsusPC extends AbstractPC {
    private AsusPC(String computerName, ComputerBrand computerBrand, int cpuPowder, Double gpuPowder, boolean isOverclocked) {
        super(computerName, computerBrand, cpuPowder, gpuPowder, isOverclocked);
    }

    public static AbstractPC createAsusN53() {
        return new AsusPC("Asus N53", ComputerBrand.ASUS, 68, 0.89, false);

    }
    public static AbstractPC createAsusH23() {
        return new AsusPC("Asus H23", ComputerBrand.ASUS, 88, 0.99, false);
    }

}

