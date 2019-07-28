package com.mathxh.Builder;

public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeClass(String strClass);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
