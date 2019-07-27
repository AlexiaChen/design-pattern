package com.mathxh.Adapter.DelegateAdapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBannerAdapter("I am delegate adapter pattern.");
        p.printWeak();
        p.printStrong();
    }
}
