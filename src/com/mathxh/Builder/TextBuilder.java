package com.mathxh.Builder;

import java.util.Arrays;
import java.util.List;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("###########################################\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeClass(String strClass) {
        buffer.append("▇▇" + strClass + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        List<String> list = Arrays.asList(items);
        list.forEach(item -> buffer.append("     ." + item + "\n"));
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("###########################################\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
