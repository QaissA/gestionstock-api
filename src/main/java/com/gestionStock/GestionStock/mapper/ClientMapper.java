package com.gestionStock.GestionStock.mapper;

import com.gestionStock.GestionStock.dto.AdresseDto;
import com.gestionStock.GestionStock.dto.ClientDto;
import com.gestionStock.GestionStock.model.Adresse;
import com.gestionStock.GestionStock.model.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AdresseMapper.class})
public interface ClientMapper {

    ClientDto fromEntity(Client client);

    Client toEntity(ClientDto clientDto);

}
