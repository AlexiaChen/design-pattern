package com.mathxh.Interpreter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIMain extends Frame implements ActionListener {
    private RobotCanvas canvas = new RobotCanvas(400,400);
    private InterpreterFacade facade = new InterpreterFacade(canvas);
    private TextField programTextField = new TextField("program repeat 4 repeat 3 go right go left end right end  end");
    public GUIMain(String title) {
        super(title);

        canvas.setExecutor(facade);
        setLayout(new BorderLayout());
        programTextField.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        add(programTextField, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        pack();
        parseAndExecute();
        show();
    }

    public static void main(String[] args) {
        new GUIMain("Interpreter Pattern GUI sample");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == programTextField) {
            parseAndExecute();
        }
    }

    private void parseAndExecute() {
        String text = programTextField.getText();
        System.out.println("ProgramText = " + text);
        facade.parse(text);
        canvas.repaint();
    }
}
