package com.web2.trabalhorest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web2.trabalhorest.repositories.LivroRepository;
import com.web2.trabalhorest.models.Livro;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> getAllLivros(){
        return livroRepository.findAll();
    }

    public Optional<Livro> getLivroByID(Long id){
        return livroRepository.findById(id);
    }

    public Livro saveLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public void deleteLivroByID(Long id){
        livroRepository.deleteById(id);
    }

    public List<Livro> getLivroByCategoria(Long id) {
        return livroRepository.findByCategoriasId(id);
    }

    public List<Livro> getLivroByAutor(Long id) {
        return livroRepository.findByAutoresId(id);
    }
}
