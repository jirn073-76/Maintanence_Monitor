package com.example.maintanence_monitor;

public class MaintanenceMonitor {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void resetMessage() {
        message = "";
    }

    private String message;
}
