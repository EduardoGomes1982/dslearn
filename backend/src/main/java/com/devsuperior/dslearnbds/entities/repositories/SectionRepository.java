package com.devsuperior.dslearnbds.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Section;

public interface SectionRepository extends JpaRepository <Section, Long> {
    
}
