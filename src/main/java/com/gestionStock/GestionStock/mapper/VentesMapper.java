package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.VentesDto;
import com.gestionStock.GestionStock.model.Ventes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentesMapper {

    VentesDto fromEntity(Ventes ventes);

    Ventes toEntity(VentesDto ventesDto);
}
