package com.devsuperior.dslearnbds.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @EqualsAndHashCode.Include
    private Long id;
    
    private String authority;
}
