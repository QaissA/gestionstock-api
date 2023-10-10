package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.CategoryDto;
import com.gestionStock.GestionStock.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDto fromEntity(Category category);

    Category toEntity(CategoryDto categoryDto);
}
