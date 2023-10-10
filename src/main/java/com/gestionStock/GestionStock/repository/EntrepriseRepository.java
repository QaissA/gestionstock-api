package com.gestionStock.GestionStock.repository;

import com.gestionStock.GestionStock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
}
