package com.mathxh.Adapter.ExtendAdapter;

public class PrintBannerAdapter extends Banner implements  Print {

    public PrintBannerAdapter(String content) {
        super(content);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
