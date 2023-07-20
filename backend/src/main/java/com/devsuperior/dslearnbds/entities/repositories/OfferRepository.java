package com.devsuperior.dslearnbds.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Offer;

public interface OfferRepository extends JpaRepository <Offer, Long> {
    
}
