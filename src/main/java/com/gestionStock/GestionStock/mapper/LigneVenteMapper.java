package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.LigneVenteDto;
import com.gestionStock.GestionStock.model.LigneVente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LigneVenteMapper {

    LigneVenteDto fromEntity(LigneVente ligneVente);

    LigneVente toEntity(LigneVenteDto ligneVenteDto);
}
