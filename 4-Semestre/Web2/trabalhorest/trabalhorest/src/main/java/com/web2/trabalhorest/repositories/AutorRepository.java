package com.web2.trabalhorest.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web2.trabalhorest.models.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    @Query("SELECT l.nome FROM Livro l JOIN l.autores a WHERE a.id = :autorId ORDER BY l.nome")
    List<String> findLivrosByAutorId(@Param("autorId") Long autorId);
}