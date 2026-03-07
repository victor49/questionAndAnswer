package com.proyecto.questionAndAnswer.perisistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.questionAndAnswer.perisistence.entity.RoleEntity;

public interface CrudRoleEntity extends CrudRepository<RoleEntity, Integer> {

}
