package com.mathxh.Prototype;

import java.util.HashMap;

public class ProductManager {
    private HashMap showcase = new HashMap();

    public void resgiter(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        Product p = (Product)showcase.get(name);
        return p.createClone();
    }
}
