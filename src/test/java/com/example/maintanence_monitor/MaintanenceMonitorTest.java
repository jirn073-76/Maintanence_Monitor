package com.example.maintanence_monitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintanenceMonitorTest {
    MaintanenceMonitor m = new MaintanenceMonitor();

    @Test
    void testGetMessage() {
        // Arrange
        String expected = null;

        // Act
        String result = m.getMessage();

        // Assert
        assertEquals(expected, result);
    }
}