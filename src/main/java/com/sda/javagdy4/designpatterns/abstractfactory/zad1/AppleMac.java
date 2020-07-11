package com.sda.javagdy4.designpatterns.abstractfactory.zad1;

public class AppleMac extends AbstractPC {
    private AppleMac(String computerName, ComputerBrand computerBrand, int cpuPowder, Double gpuPowder, boolean isOverclocked) {
        super(computerName, computerBrand, cpuPowder, gpuPowder, isOverclocked);
    }
    public static AbstractPC createMacProRetina15() {
        return new AppleMac("MacProRetina15", ComputerBrand.APPLE, 90, 0.99, false);
    }
    public static AbstractPC createMacProRetina20() {
        return new AppleMac("MacProRetina20", ComputerBrand.APPLE, 92, 0.99, false);
    }
}
