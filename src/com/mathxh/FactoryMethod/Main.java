package com.mathxh.FactoryMethod;

/*
*  工厂方法模式： 将实例的生成交给子类。用工厂加工产品的方式来构建产品流程，并用了模板方法来生成实例
*
*
*
*/

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Mr. Huang");
        Product card2 = factory.create("Mr. Lee");
        Product card3 = factory.create("Mr. Gao");

        card1.use();
        card2.use();
        card3.use();
    }
}
