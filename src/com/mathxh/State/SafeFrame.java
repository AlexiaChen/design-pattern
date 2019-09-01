package com.mathxh.State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10,60);
    private Button buttonUse = new Button("Use Vault");
    private Button buttonAlarm = new Button("Alarm");
    private Button buttonPhone = new Button("Communication");
    private Button buttonExit = new Button("Exit");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        add(panel, BorderLayout.SOUTH);

        pack();
        show();

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void setClock(int hour) {
        String clockString = "Current time:";
        if(hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }

        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record... " + msg + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(actionEvent.toString());

        if(actionEvent.getSource() == buttonUse) {
            state.doUse(this);
        } else if(actionEvent.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if(actionEvent.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if(actionEvent.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }
}
