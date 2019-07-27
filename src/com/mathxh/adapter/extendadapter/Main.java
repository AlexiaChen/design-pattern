package com.mathxh.adapter.extendadapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBannerAdapter("I am extend adapter pattern.");
        p.printWeak();
        p.printStrong();
    }
}
