package com.devsuperior.dslearnbds.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslearnbds.dto.UserDTO;
import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.services.AuthService;
import com.devsuperior.dslearnbds.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;

    @Autowired
    private AuthService authService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> searchById(@PathVariable Long id) {
        User user = authService.authenticated();
        return ResponseEntity.ok().body(service.findById(id));
    }
}
