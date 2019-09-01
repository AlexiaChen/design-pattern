package com.mathxh.Proxy;

public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("Printer instance is creating...");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer instance is creating (" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("====== " + name + " ======");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.print(msg);

        for(int i = 0; i < 5; ++i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print(".");
        }

        System.out.println("Finished.");
    }
}
