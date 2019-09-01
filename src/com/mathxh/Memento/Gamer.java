package com.mathxh.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List fruits = new ArrayList<String>();
    private Random random = new Random();
    private static String[] fruitsName = {
            "Apple", "Grape", "Banana", "Orange"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if(dice == 1) {
            money += 100;
            System.out.println("Current amount of money increased.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("Current amount of money down to half");
        } else if(dice == 6) {
            String f = getFruit();
            System.out.println("Got a fruit ( " + f + " ).");
            fruits.add(f);
        } else {
            System.out.println("Nothing happen.");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        fruits.forEach(it -> {
            if(((String)it).startsWith("delicious")) {
                memento.addFruit((String) it);
            }
        });
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if(random.nextBoolean()) {
            prefix = "delicious";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
