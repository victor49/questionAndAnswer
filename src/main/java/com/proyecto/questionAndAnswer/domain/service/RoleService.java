package com.proyecto.questionAndAnswer.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.questionAndAnswer.domain.dto.RoleDto;
import com.proyecto.questionAndAnswer.domain.repository.RoleRepository;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public List<RoleDto> getAll()
    {
        return this.roleRepository.getAll();
    }
}
