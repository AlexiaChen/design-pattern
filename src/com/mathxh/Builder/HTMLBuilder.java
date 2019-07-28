package com.mathxh.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>" + title + "</title>");
        writer.println("</head>");
        writer.println("<body>");
    }

    @Override
    public void makeClass(String strClass) {
        writer.println("<p>" + strClass + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");

        List<String> list = Arrays.asList(items);
        list.forEach(item -> writer.println("<li>" + item + "</li>"));

        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
