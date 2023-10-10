package com.gestionStock.GestionStock.validators;

import com.gestionStock.GestionStock.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public static List<String> valdiate(EntrepriseDto entrepriseDto) {

        List<String> errors = new ArrayList<>();

        if(entrepriseDto == null) {
            errors.add("veuillez remplir les champs de l'entreprise");
        }

        if(!StringUtils.hasLength(entrepriseDto.getNom())) {
            errors.add("veuillez remplir le nom de l'entrprise");
        }

        if(!StringUtils.hasLength(entrepriseDto.getDescription())) {
            errors.add("veuillez remplir la description de l'entrprise");
        }

        if(!StringUtils.hasLength(entrepriseDto.getCodeFiscal())) {
            errors.add("veuillez remplir le code Fiscal de l'entrprise");
        }

        if(!StringUtils.hasLength(entrepriseDto.getEmail())) {
            errors.add("veuillez remplir l'Email de l'entrprise");
        }

        if(!StringUtils.hasLength(entrepriseDto.getNumTel())) {
            errors.add("veuillez remplir la numero de telephone de l'entrprise");
        }

        errors.addAll(AdresseValidator.validate(entrepriseDto.getAdresse()));
        return errors;
    }
}
