package com.gestionStock.GestionStock.repository;

import com.gestionStock.GestionStock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    @Query("select u from utilisateur u where u.email = :email")
    Optional<Utilisateur> FindUtilisateurByEmail(@Param("email") String email);
}
