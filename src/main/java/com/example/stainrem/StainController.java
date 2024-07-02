package com.example.stainrem;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stains")
@CrossOrigin(origins = "*")
public class StainController {
    @Autowired
    private StainService stainService;

    @GetMapping
    public List<Stain> getAllStains() {
        return stainService.getAllStains();
    }

    // Other endpoints if needed
}
