package com.iset.produits;

import com.iset.produits.entities.Produit;
import com.iset.produits.service.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner {
    @Autowired
    private ProduitServiceImpl service;
    public static void main(String[] args) {
        SpringApplication.run(ProduitsApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

    }
}