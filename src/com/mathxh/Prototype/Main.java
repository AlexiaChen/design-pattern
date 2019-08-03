package com.mathxh.Prototype;


/*
*   原型模式： 通过复制生成实例。
*   1. 对象种类繁多，无法将它们整合到一个类里
*   2. 难以根据类生成实例
*   3. 想解偶框架与生成的实例
*/

public class Main {
    public static void main(String[] args) {

        // Prepare
        ProductManager manager = new ProductManager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.resgiter("StrongMsg", upen);
        manager.resgiter("WarningBox", mbox);
        manager.resgiter("SlashBox", sbox);

        // Use
        Product p1 = manager.create("StrongMsg");
        p1.use("I'm Strong man");

        Product p2 = manager.create("WarningBox");
        p2.use("The Door is BROKEN !!!");

        Product p3 = manager.create("SlashBox");
        p3.use("Cong! You are get into UC Berkeley.");
    }
}
