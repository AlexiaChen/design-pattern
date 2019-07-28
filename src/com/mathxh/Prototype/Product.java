package com.mathxh.Prototype;

public interface Product extends Cloneable {
    void use(String content);
    Product createClone();
}
