package com.mathxh.Prototype;

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
