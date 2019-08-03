package com.mathxh.Bridge;

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("Hello, China."));
        display1.dispaly();

        Display display2 = new CountDisplay(new StringDisplayImpl("Hello, Hong Kong"));
        display2.dispaly();

        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hey, Earth"));
        display3.dispaly();
        display3.multiDisplay(5);
    }
}
