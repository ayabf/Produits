package com.iset.produits.dao;

import com.iset.produits.entities.Categorie;
import com.iset.produits.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    Page<Produit> findByNomProduit(String nom, Pageable pageable);
    List<Produit> findByNomProduitContains(String nom);
    @Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
            List<Produit> findByNomPrix (@Param("nom") String nom, @Param("prix") Double prix);
    @Query("select p from Produit p where p.categorie = ?1")
    List<Produit> findByCategorie (Categorie categorie);
    List<Produit> findByCategorieIdCat(Long id);
    List<Produit> findByOrderByNomProduitAsc();
    @Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
    List<Produit> trierProduitsNomsPrix ();

}

