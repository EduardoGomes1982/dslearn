package com.devsuperior.dslearnbds.entities;

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
@Table(name = "tb_section")
public class Section {
    @EqualsAndHashCode.Include
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private String description;

    @NonNull
    private Integer position;

    @NonNull
    private String imgUri;
    
    @NonNull
    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
    
    @NonNull
    @ManyToOne
    @JoinColumn(name = "prerequisite_id")
    private Section prerequisite;
}
