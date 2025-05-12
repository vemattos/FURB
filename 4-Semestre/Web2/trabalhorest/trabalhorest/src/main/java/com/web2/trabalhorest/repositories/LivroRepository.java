package com.web2.trabalhorest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web2.trabalhorest.models.Livro;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByCategoriasId(Long id);

    List<Livro> findByAutoresId(Long id);
}
