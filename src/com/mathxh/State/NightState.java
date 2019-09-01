package com.mathxh.State;

public class NightState implements State {
    private static NightState singleton = new NightState();
    private NightState() {

    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour >= 9 && 17 > hour) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("Emergency: Use vault (Night).");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Pressed Alarm button (Night)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Recording the Communication (Night)");
    }

    public String toString() {
        return "[ Night ]";
    }
}
