package com.devsuperior.dslearnbds.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Enrollment;
import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository <Enrollment, EnrollmentPK> {
    
}
