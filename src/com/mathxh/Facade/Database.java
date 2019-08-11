package com.mathxh.Facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class Database {
    private Database() {

    }

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        String path = System.getProperty("user.dir") + "/src/com/mathxh/Facade/" + filename;
        try {
            prop.load(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
