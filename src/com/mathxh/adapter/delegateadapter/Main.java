package com.mathxh.adapter.delegateadapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBannerAdapter("I am back.");
        p.printWeak();
        p.printStrong();
    }
}
