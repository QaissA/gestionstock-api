package com.gestionStock.GestionStock.validators;

import com.gestionStock.GestionStock.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {

    public static List<String> validate(CommandeClientDto commandeClientDto) {
        List<String> errors = new ArrayList<>();

        if(commandeClientDto == null) {
            errors.add("veuillez remplir les champs de la commande de client");
        }

        if(!StringUtils.hasLength(commandeClientDto.getCode())) {
            errors.add("veuillez renseigner le code de la commande");
        }

        if(commandeClientDto.getDateCommande() == null) {
            errors.add("veuillez renseigner la date de la commande");
        }

        if(!StringUtils.hasLength(commandeClientDto.getEtatCommande().toString())) {
            errors.add("Veuillez renseigner l'etat de la commande");
        }

        if(commandeClientDto.getClient() == null || commandeClientDto.getClient().getId() == null) {
            errors.add("veuillez renseigner le client");
        }

        return errors;
    }
}
