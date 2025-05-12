package com.web2.trabalhorest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web2.trabalhorest.models.Categoria;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query("SELECT l.nome FROM Livro l JOIN l.categorias c WHERE c.id = :categoriaId ORDER BY l.nome")
    List<String> findLivrosByCategoriaId(@Param("categoriaId") Long categoriaId);
}
