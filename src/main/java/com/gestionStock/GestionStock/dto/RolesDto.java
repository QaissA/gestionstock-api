package com.gestionStock.GestionStock.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String nomName;

    private UtilisateurDto utilisateur;
}
