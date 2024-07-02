package com.example.stainrem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipService {
    @Autowired
    private TipRepository tipRepository;

    public List<Tip> getTipsByStainAndAge(Long stainId, String age) {
        return tipRepository.findByStainIdAndAge(stainId, age);
    }

    // Other methods if needed
}
