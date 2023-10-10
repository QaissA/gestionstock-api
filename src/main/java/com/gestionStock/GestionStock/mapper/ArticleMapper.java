package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.ArticleDto;
import com.gestionStock.GestionStock.model.Article;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    ArticleDto FromEntity(Article article);

    Article ToEntity(ArticleDto articleDto);
}
