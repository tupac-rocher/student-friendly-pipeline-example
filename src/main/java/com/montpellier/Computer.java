package com.montpellier;

public class Computer extends Device{
    private boolean isOn;
    private boolean terminalOn;

    public Computer() {
        super(1,2,3);
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

    public void openTerminal(){
        if(isOn){
            terminalOn = true;
        }
    }

    public void printHelloWorld(){
        if(terminalOn){
            System.out.println("Hello World!");
        }
    }
}

