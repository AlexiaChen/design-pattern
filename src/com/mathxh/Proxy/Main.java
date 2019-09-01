package com.mathxh.Proxy;


/*
* 代理模式： 只在必要的时候生成实例。代理人就是代理别人工作，不需要本人的时候就找代理人完成，代理人完成不了就找本人。
*
*
 */

public class Main {
    public static void main(String[] args) {
        Printable printable = new PrinterProxy("Alice");
        System.out.println("Current name: " + printable.getPrinterName());
        printable.setPrinterName("Bob");
        System.out.println("Current name: " + printable.getPrinterName());
        printable.print("Hello world.");
        printable.print("A bunch of msg.");
    }
}
