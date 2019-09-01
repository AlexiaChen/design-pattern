package com.mathxh.Proxy;

public class PrinterProxy implements Printable {
    private String name;
    private Printer real;
    public PrinterProxy() {

    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        makeReal();
        real.print(string);
    }

    private synchronized void makeReal() {
        if(real == null) {
            real = new Printer(name);
        }
    }
}
