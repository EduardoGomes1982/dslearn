package com.devsuperior.dslearnbds.entities;

import java.util.HashSet;
import java.util.Set;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;

    @NonNull
    @Setter(AccessLevel.NONE)
    private Set<Role> roles = new HashSet<>();
}
