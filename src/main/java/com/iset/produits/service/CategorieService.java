package com.iset.produits.service;

import com.iset.produits.entities.Categorie;
import com.iset.produits.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategorieService {
    Categorie saveCategorie(Categorie c);
    Categorie updateCategorie(Categorie c);
    void deleteCategorie(Categorie c);
    void deleteCategorieById(Long id);
    Categorie getCategorie(Long id);
    Page<Categorie> findByNomCat(String nom, Pageable pageable);
    Page<Categorie> getAllCategorieParPage(String nom, int page, int size);
    List<Categorie> getAll();
}
