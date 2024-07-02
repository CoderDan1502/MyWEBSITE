package com.example.stainrem;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Tip {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "stain_id", nullable = false)
    private class stain;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String tip;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Stain getStain() {
        return stain;
    }

    public void setStain(Stain stain) {
        this.stain = stain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}