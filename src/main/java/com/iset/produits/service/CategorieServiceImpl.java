package com.iset.produits.service;

import com.iset.produits.dao.CategorieRepository;
import com.iset.produits.entities.Categorie;
import com.iset.produits.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService{
    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public Categorie saveCategorie(Categorie c) {
        return categorieRepository.save(c);
    }
    @Override
    public Categorie updateCategorie(Categorie c) {
        return categorieRepository.save(c);
    }
    @Override
    public void deleteCategorie(Categorie c) {
        categorieRepository.delete(c);
    }
    @Override
    public void deleteCategorieById(Long id) {
        categorieRepository.deleteById(id);}
    @Override
    public Categorie getCategorie(Long id) {
        return categorieRepository.findById(id).get();
    }
    @Override
    public Page<Categorie> findByNomCat(String nom, Pageable pageable) {
        return categorieRepository.findByNomCat(nom, pageable);
    }
    @Override
    public Page<Categorie> getAllCategorieParPage(String nom, int page, int size){
        Page<Categorie> categorie;
        if(nom.isEmpty()) {
            categorie = categorieRepository.findAll(PageRequest.of(page, size));
        } else {
            categorie = categorieRepository.findByNomCat(nom,PageRequest.of(page, size));
        }return categorie;
    }
    @Override
    public List<Categorie> getAll(){
        return categorieRepository.findAll();
    }
}
