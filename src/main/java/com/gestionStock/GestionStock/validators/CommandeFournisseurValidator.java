package com.gestionStock.GestionStock.validators;

import com.gestionStock.GestionStock.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {

    public static List<String> valdiate(CommandeFournisseurDto commandeFournisseurDto) {

        List<String> errors = new ArrayList<>();

        if(commandeFournisseurDto == null) {
            errors.add("veuillez remplir les champs de la commande du fournisseur");
        }

        if(!StringUtils.hasLength(commandeFournisseurDto.getCode())) {
            errors.add("veuillez renseigner le code de la commande de fournisseur");
        }

        if(commandeFournisseurDto.getDateCommande() == null) {
            errors.add("veuillez renseigner la date de la commande");
        }

        if(!StringUtils.hasLength(commandeFournisseurDto.getEtatCommand().toString())) {
            errors.add("veuilelz renseigner l'etat de la commande du fournisseur");
        }

        if(commandeFournisseurDto.getFournisseur() == null || commandeFournisseurDto.getFournisseur().getId() == null) {
            errors.add("veuillez renseigner le Fournisseur");
        }

        return errors;
    }
}
