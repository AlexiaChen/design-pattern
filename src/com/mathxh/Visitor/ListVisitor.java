package com.mathxh.Visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file.toString());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory.toString());
        String savedir = currentDir;
        currentDir = currentDir + "/" + directory.getName();

        Iterator it =  directory.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentDir = savedir;
    }
}
