package com.gestionStock.GestionStock.validators;

import com.gestionStock.GestionStock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticleDto articleDto) {
        List<String> errors = new ArrayList<>();

        if(articleDto == null) {
            errors.add("veuillez remplir les champs de l'article");
        }

        if(!StringUtils.hasLength(articleDto.getCodeArticle())) {
            errors.add("veuillez renseigner le code de l'article");
        }

        if(!StringUtils.hasLength(articleDto.getDesignation())) {
            errors.add("Veuillez renseigner la designation");
        }

        if(articleDto.getPrixUnitaireHt() == null) {
            errors.add("veuillez renseigner le prix Unitaire Ht de l'article");
        }

        if(articleDto.getTauxTva() == null) {
            errors.add("veuillez renseigner le taux tva de l'article");
        }

        if(articleDto.getPrixUnitaireTtc() == null) {
            errors.add("veuillez renseigner le prix unitaire ttc de l'article");
        }

        if(articleDto.getCategory() == null || articleDto.getCategory().getId() == null) {
            errors.add("veuillez selectionner une category");
        }
        return  errors;
    }
}
