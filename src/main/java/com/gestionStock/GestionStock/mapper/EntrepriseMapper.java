package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.AdresseDto;
import com.gestionStock.GestionStock.dto.EntrepriseDto;
import com.gestionStock.GestionStock.model.Adresse;
import com.gestionStock.GestionStock.model.Entreprise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AdresseMapper.class})
public interface EntrepriseMapper {

    EntrepriseDto fromEntity(Entreprise entreprise);

    Entreprise toEntity(EntrepriseDto entrepriseDto);

}
