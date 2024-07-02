package com.example.stainrem;



import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Stain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "stain", cascade = CascadeType.ALL)
    private Set<Tip> tips;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Tip> getTips() {
        return tips;
    }

    public void setTips(Set<Tip> tips) {
        this.tips = tips;
    }
}