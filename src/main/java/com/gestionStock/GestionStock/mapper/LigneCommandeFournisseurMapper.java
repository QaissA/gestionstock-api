package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.LigneCommandeFournisseurDto;
import com.gestionStock.GestionStock.model.LigneCommandeFournisseur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AdresseMapper.class})
public interface LigneCommandeFournisseurMapper {

    LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur);

    LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto);
}
