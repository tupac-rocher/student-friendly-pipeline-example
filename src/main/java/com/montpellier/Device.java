package com.montpellier;
public abstract class Device {
    final static int third_Constant3 = 1000;
    private int a;
    private int b;
    private int c;

    public Device(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void foo(int c) {
        // overlapping by method argument
        c = c;            // violation, reference to instance variable "c" requires "this"
    }
    public void foo2(int c) {
        System.out.println("test");
        // overlapping by method argument
    }
    private void emptyLoop() {
        for (int i = 0; i < 10; i++) { // violation
        }

        try { // violation

        } catch (Exception e) {
            // ignored
        }
        int test = 0;
        if (true) {
            test = 1; // violation
        }
        String text ="";
        text = (text.equals("")) ? "" : text;
    }
}
