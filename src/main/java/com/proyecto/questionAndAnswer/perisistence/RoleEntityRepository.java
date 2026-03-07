package com.proyecto.questionAndAnswer.perisistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyecto.questionAndAnswer.domain.dto.RoleDto;
import com.proyecto.questionAndAnswer.domain.repository.RoleRepository;
import com.proyecto.questionAndAnswer.perisistence.crud.CrudRoleEntity;
import com.proyecto.questionAndAnswer.perisistence.mapper.RoleMapper;

@Repository
public class RoleEntityRepository  implements RoleRepository{
    private final CrudRoleEntity crudRoleEntity;
    private final RoleMapper roleMapper;

    public RoleEntityRepository(CrudRoleEntity crudRoleEntity, RoleMapper roleMapper) {
        this.crudRoleEntity = crudRoleEntity;
        this.roleMapper = roleMapper;
    }
    

    @Override
    public List<RoleDto> getAll() {
        return this.roleMapper.toDto(this.crudRoleEntity.findAll());
    }
    

}
