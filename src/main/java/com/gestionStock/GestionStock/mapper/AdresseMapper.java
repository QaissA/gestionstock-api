package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.AdresseDto;
import com.gestionStock.GestionStock.model.Adresse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdresseMapper {

AdresseDto fromEntity(Adresse adresse);
Adresse toEntity(AdresseDto adresseDto);
}
