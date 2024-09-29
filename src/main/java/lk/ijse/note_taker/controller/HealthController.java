package lk.ijse.note_taker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/healthtest")
public class HealthController {

    @GetMapping
    public String healthCheck() {
        System.out.println("Note Taker API is running");
        return "Note Taker API is running";
    }

}
