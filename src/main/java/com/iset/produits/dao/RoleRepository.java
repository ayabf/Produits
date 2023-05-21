package com.iset.produits.dao;

import com.iset.produits.entities.Role;
import com.iset.produits.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
