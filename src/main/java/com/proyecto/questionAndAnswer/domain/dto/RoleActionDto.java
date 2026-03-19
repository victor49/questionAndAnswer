package com.proyecto.questionAndAnswer.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record RoleActionDto(
    @NotBlank(message = "This role is required")
    String role
) {

}
