package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.AdresseDto;
import com.gestionStock.GestionStock.dto.UtilisateurDto;
import com.gestionStock.GestionStock.model.Adresse;
import com.gestionStock.GestionStock.model.Utilisateur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AdresseMapper.class})
public interface UtilisateurMapper {

    UtilisateurDto fromEntity(Utilisateur utilisateur);

    Utilisateur toEntity(UtilisateurDto utilisateurDto);


}
