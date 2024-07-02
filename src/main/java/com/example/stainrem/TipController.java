package com.example.stainrem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tips")
@CrossOrigin(origins = "*")
public class TipController {
    @Autowired
    private TipService tipService;

    @GetMapping
    public List<Tip> getTipsByStainAndAge(@RequestParam Long stainId, @RequestParam String age) {
        return tipService.getTipsByStainAndAge(stainId, age);
    }

    // Other endpoints if needed
}
