package com.kayo.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kayo.backend.domain.Categoria;

// JpaRepository é onde vamos realizar a comunicação
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
