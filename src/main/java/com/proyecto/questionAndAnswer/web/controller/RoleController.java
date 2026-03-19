package com.proyecto.questionAndAnswer.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.questionAndAnswer.domain.dto.RoleActionDto;
import com.proyecto.questionAndAnswer.domain.dto.RoleDto;
import com.proyecto.questionAndAnswer.domain.service.RoleService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
    
    @PostMapping()
    public ResponseEntity<RoleDto> add(@RequestBody @Valid RoleActionDto roleActionDto) {
        RoleDto roleDto = this.roleService.add(roleActionDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(roleDto);
    }
    
    

}
