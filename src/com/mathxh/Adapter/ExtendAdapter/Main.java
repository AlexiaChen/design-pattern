package com.mathxh.Adapter.ExtendAdapter;

/*
*  适配器模式： 也被称作包装器模式（Wrapper），它位于实际情况和需求之间，主要是填补两者的差异。
*
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBannerAdapter("I am extend adapter pattern.");
        p.printWeak();
        p.printStrong();
    }
}
