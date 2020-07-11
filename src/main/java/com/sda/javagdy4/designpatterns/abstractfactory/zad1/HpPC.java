package com.sda.javagdy4.designpatterns.abstractfactory.zad1;

public class HpPC extends AbstractPC {
    public HpPC(String computerName, ComputerBrand computerBrand, int cpuPowder, Double gpuPowder, boolean isOverclocked) {
        super(computerName, computerBrand, cpuPowder, gpuPowder, isOverclocked);
    }

    private static AbstractPC createHpPCPavilion(){
        return new HpPC("Hp pavilion", ComputerBrand.HP, 89, 0.98, false);
    }

    private static AbstractPC createHpPCPavilionGaming(){
        return new HpPC("Hp pavilion Gaming", ComputerBrand.HP, 99, 0.99, false);
    }
}
