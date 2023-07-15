package com.devsuperior.dslearnbds.entities;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "tb_offer")
public class Offer {
    @EqualsAndHashCode.Include
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String edition;

    @NonNull
    private Instant startMoment;

    @NonNull
    private Instant endMoment;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
