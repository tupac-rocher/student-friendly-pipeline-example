package com.montpellier;

public class Computer {
    private boolean isOn;

    public Computer(){
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOnComputer() {
        isOn = true;
    }

    public void turnOffComputer() {
        isOn = false;
    }
}
