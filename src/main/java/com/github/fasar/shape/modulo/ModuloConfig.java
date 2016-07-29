package com.github.fasar.shape.modulo;

/**
 * Created by SARTOR on 29.07.2016.
 */
public class ModuloConfig {

    private int modulo = 10;
    private double multiplier = 1;
    private double multiplierStep = 1.1;
    private int lineSize = 1;
    private int circleLineSize = 1;
    private int dotSize = 3;
    private int cicleRadius = 3;

    public int getModulo() {
        return modulo;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public double getMultiplierStep() {
        return multiplierStep;
    }

    public int getLineSize() {
        return lineSize;
    }

    public int getCircleLineSize() {
        return circleLineSize;
    }

    public int getDotSize() {
        return dotSize;
    }

    public int getCicleRadius() {
        return cicleRadius;
    }
}
