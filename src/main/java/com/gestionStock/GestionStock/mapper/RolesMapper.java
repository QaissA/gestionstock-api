package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.RolesDto;
import com.gestionStock.GestionStock.model.Roles;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AdresseMapper.class})
public interface RolesMapper {

    RolesDto fromEntity(Roles roles);

    Roles toEntity(RolesDto rolesDto);
}
