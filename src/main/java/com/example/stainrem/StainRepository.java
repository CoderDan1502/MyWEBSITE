package com.example.stainrem;




import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StainRepository extends JpaRepository<Stain, Long> {
    List<Stain> findAll();
}
