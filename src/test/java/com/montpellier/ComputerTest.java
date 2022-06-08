package com.montpellier;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void test_1(){
        Computer computer = new Computer();
        assertTrue(computer.isOn());
    }

    @Test
    public void test_2(){
        Computer computer = new Computer();
        computer.turnOnComputer();
        assertTrue(computer.isOn());
    }
}
