package com.sda.javagdy4.designpatterns.abstractfactory.zad1;

public abstract class AbstractPC {
    private String computerName;
    private ComputerBrand computerBrand;
    private int cpuPowder;
    private Double gpuPowder;
    private boolean isOverclocked;

    public AbstractPC(String computerName, ComputerBrand computerBrand, int cpuPowder, Double gpuPowder, boolean isOverclocked) {
        this.computerName = computerName;
        this.computerBrand = computerBrand;
        this.cpuPowder = cpuPowder;
        this.gpuPowder = gpuPowder;
        this.isOverclocked = isOverclocked;
    }
}
