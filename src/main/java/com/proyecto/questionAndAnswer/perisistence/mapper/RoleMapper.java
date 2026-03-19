package com.proyecto.questionAndAnswer.perisistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.proyecto.questionAndAnswer.domain.dto.RoleActionDto;
import com.proyecto.questionAndAnswer.domain.dto.RoleDto;
import com.proyecto.questionAndAnswer.perisistence.entity.RoleEntity;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDto toDto(RoleEntity Entity);
    List<RoleDto> toDto(Iterable<RoleEntity> entities);

    RoleEntity toDtoEntity(RoleActionDto roleActionDto);


}
