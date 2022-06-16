package com.example.maintanence_monitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintanenceMonitorTest {
    MaintanenceMonitor m = new MaintanenceMonitor();

    @Test
    void resetMessage() {
        String expected = "";

        m.setMessage("lmao");
        m.resetMessage();
        String result = m.getMessage();

        assertEquals(expected, result);
    }
}