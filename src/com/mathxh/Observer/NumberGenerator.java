package com.mathxh.Observer;

import java.util.ArrayList;

public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(it -> {
            it.update(this);
        });
    }

    public abstract int getNumber();
    public abstract void execute();
}
