package com.mathxh.FactoryMethod;

public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("Make " + owner + "'s ID Card");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use " + owner + "'s ID Card");
    }

    public String getOwner() {
        return owner;
    }
}
