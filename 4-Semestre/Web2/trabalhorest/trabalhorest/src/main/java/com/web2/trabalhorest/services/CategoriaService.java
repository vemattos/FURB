package com.web2.trabalhorest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web2.trabalhorest.repositories.CategoriaRepository;
import com.web2.trabalhorest.models.Categoria;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;


    public List<Categoria> getAllCategorias(){
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> getCategoriaByID(Long id){
        return categoriaRepository.findById(id);
    }

    public Categoria saveCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public void deleteCategoriaByID(Long id){
       categoriaRepository.deleteById(id);
    }

    public List<String> getLivrosByCategoria(Long categoriaId) {
        return categoriaRepository.findLivrosByCategoriaId(categoriaId);
    }
}
