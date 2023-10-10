package com.gestionStock.GestionStock.validators;

import com.gestionStock.GestionStock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();

        if(utilisateurDto == null) {
            errors.add("Veuillez remplirs les champs pour l'utilisateur");
        }

        if(!StringUtils.hasLength(utilisateurDto.getNom())) {
            errors.add("Veuillez remplir le nom d'utilisateur");
        }

        if(!StringUtils.hasLength(utilisateurDto.getPrenom())) {
            errors.add("Veuillez remplir le prenom d'utilisateur");
        }

        if(!StringUtils.hasLength(utilisateurDto.getEmail())) {
            errors.add("Veuillez remplir l'email d'utilisateur");
        }

        if(utilisateurDto.getDateDeNaissance() == null ){
            errors.add("veuillez remplir le champ de date de naissance");
        }

        errors.addAll(AdresseValidator.validate(utilisateurDto.getAdresse()));

        return errors;
    }
}
