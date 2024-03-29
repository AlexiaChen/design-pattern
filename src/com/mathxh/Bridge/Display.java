package com.mathxh.Bridge;

public class Display {
    DisplayImpl impl;

    public  Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void dispaly() {
        open();
        print();
        close();
    }
}
