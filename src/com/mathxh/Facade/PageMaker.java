package com.mathxh.Facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }
    public static void makeWelcomePage(String mailaddr, String filename)  {
        Properties mailprop = Database.getProperties("maildata");
        String username = mailprop.getProperty(mailaddr);

        HTMLWriter writer = null;
        try {
            writer = new HTMLWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(" Waiting for your e-mail!");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " ( " + username + " )");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
