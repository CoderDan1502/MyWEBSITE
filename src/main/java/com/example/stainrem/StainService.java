package com.example.stainrem;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StainService {
    @Autowired
    private StainRepository stainRepository;

    public List<Stain> getAllStains() {
        return stainRepository.findAll();
    }

    // Other methods if needed
}
