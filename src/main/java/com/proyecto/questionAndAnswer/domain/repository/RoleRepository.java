package com.proyecto.questionAndAnswer.domain.repository;

import java.util.List;

import com.proyecto.questionAndAnswer.domain.dto.RoleActionDto;
import com.proyecto.questionAndAnswer.domain.dto.RoleDto;

public interface RoleRepository {
    List<RoleDto> getAll();
    RoleDto getById(Integer id);
    RoleDto save(RoleActionDto roleActionDto);



}
