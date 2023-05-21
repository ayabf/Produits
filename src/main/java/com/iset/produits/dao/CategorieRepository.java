package com.iset.produits.dao;

import com.iset.produits.entities.Categorie;
import com.iset.produits.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    Page<Categorie> findByNomCat(String nom, Pageable pageable);
}
