package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.AdresseDto;
import com.gestionStock.GestionStock.dto.FournisseurDto;
import com.gestionStock.GestionStock.model.Adresse;
import com.gestionStock.GestionStock.model.Fournisseur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AdresseMapper.class})
public interface FournisseurMapper {

    FournisseurDto fromEntity(Fournisseur fournisseur);

    Fournisseur toEntity(FournisseurDto fournisseurDto);

}
