package com.mathxh.Memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money;
    private ArrayList<String> fruits;

    public Memento(int money) {
        this.money = money;
        fruits = new ArrayList<String>();
    }

    public int getMoney() {
        return money;
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public List getFruits() {
        return (List)fruits.clone();
    }

}
