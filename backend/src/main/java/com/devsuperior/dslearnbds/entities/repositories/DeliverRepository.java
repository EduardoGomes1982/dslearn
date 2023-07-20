package com.devsuperior.dslearnbds.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Deliver;

public interface DeliverRepository extends JpaRepository <Deliver, Long> {
    
}
