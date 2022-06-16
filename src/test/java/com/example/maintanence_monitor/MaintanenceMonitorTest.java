package com.example.maintanence_monitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintanenceMonitorTest {
    MaintanenceMonitor m = new MaintanenceMonitor();

    @Test
    void testSetMessage() {
        // Arrange
        String expected = "lmao";

        // Act
        m.setMessage("lmao");
        var result = m.getMessage();

        // Assert
        assertEquals(expected, result);
    }
}