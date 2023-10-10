package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.MvtStkDto;
import com.gestionStock.GestionStock.model.MvtStk;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MvtStkMapper {

    MvtStkDto fromEntity(MvtStk mvtStk);

    MvtStk toEntity(MvtStkDto mvtStkDto);

}
