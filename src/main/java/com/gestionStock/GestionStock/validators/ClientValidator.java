package com.gestionStock.GestionStock.validators;

import com.gestionStock.GestionStock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDto clientDto) {
        List<String> errors = new ArrayList<>();

        if(clientDto == null) {
            errors.add("veuillez remplis les champs pour le client");
        }

        if(!StringUtils.hasLength(clientDto.getNom())) {
            errors.add("veuillez renseigner le nom du client");
        }

        if(!StringUtils.hasLength(clientDto.getPrenom())) {
            errors.add("veuillez renseigner le prenom du client");
        }

        if(!StringUtils.hasLength(clientDto.getMail())) {
            errors.add("veuillez renseigner le Mail du client");
        }

        if(!StringUtils.hasLength(clientDto.getNumTel())) {
            errors.add("veuillez renseigner le numero de telephone du client");
        }

        errors.addAll(AdresseValidator.validate(clientDto.getAdresse()));

        return errors;
    }
}
