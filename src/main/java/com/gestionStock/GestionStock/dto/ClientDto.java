package com.gestionStock.GestionStock.dto;




import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private  String photo;

    private  String mail;

    private  String numTel;

    private List<CommandeClientDto> commandeClients;
}
