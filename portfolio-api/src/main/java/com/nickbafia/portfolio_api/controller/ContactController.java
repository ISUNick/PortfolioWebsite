package com.nickbafia.portfolio_api.controller;

import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @PostMapping
    public void saveMessage(
            @RequestBody Map<String, String> payload
    ) throws IOException {

        java.io.File dir = new java.io.File("data");
        dir.mkdirs();

        try (FileWriter writer = new FileWriter("data/messages.txt", true)) {
            writer.write(
                    "\n---\n" +
                    "Time: " + LocalDateTime.now() + "\n" +
                    "Name: " + payload.get("name") + "\n" +
                    "Email: " + payload.get("email") + "\n" +
                    "Message: " + payload.get("message") + "\n"
            );
        }
    }
}
