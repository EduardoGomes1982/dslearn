package com.devsuperior.dslearnbds.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository <Topic, Long> {
    
}
