package com.devsuperior.dslearnbds.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OAuthCustomError {
    private String error;

    @JsonProperty(value = "error_description")
    private String errorDescription;
}
