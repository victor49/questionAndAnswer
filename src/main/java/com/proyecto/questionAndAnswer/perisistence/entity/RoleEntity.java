package com.proyecto.questionAndAnswer.perisistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Roles")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer IdRole;

    @Column(nullable = false)
    private String Role;
    

    public Integer getIdRole() {
        return IdRole;
    }

    public void setIdRole(Integer idRole) {
        IdRole = idRole;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }    
}
