package com.mathxh.Prototype;

// default Cloneable is not deep copy, if you want to do deep copy, you need to override clone() method
public interface Product extends Cloneable {
    void use(String content);
    Product createClone();
}
