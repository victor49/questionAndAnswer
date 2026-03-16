package com.proyecto.questionAndAnswer.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.questionAndAnswer.domain.dto.RoleDto;
import com.proyecto.questionAndAnswer.domain.service.RoleService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping()
    public ResponseEntity<List<RoleDto>> getAll() {
        return ResponseEntity.ok(this.roleService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleDto> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(this.roleService.getById(id));
    }
    
    

}
