package com.example.maintanence_monitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MaintanenceMonitorController {
    MaintanenceMonitor maintanenceMonitor = new MaintanenceMonitor();

    @RequestMapping("/status")
    public boolean getStatus()
    {
        return maintanenceMonitor.getMessage().isBlank();
    }

    @RequestMapping("/getMessage")
    public String getMessage()
    {
        return maintanenceMonitor.getMessage();
    }

    @RequestMapping("/setMessage")
    public void setStatus(@RequestParam String message)
    {
        maintanenceMonitor.setMessage(message);
    }

    @RequestMapping("/resetMessage")
    public void setStatus()
    {
        maintanenceMonitor.resetMessage();
    }
}