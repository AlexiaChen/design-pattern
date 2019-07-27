package com.mathxh.Adapter.DelegateAdapter;

public class PrintBannerAdapter extends Print {

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
