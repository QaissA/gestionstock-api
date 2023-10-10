package com.gestionStock.GestionStock.repository;

import com.gestionStock.GestionStock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
