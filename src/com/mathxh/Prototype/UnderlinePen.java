package com.mathxh.Prototype;

public class UnderlinePen implements Product {
    private char underlineChar;

    public UnderlinePen(char ulchar) {
        this.underlineChar = ulchar;
    }

    @Override
    public void use(String content) {
        int length = content.getBytes().length;

        System.out.println(content);
        for(int i = 0; i < length; ++i) {
            System.out.print(underlineChar);
        }

        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
