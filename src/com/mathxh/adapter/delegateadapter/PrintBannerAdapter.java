package com.mathxh.adapter.delegateadapter;

public class PrintBannerAdapter implements Print {

    private Banner banner;

    public PrintBannerAdapter(String content) {
        this.banner = new Banner(content);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
