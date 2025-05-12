package com.web2.trabalhorest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web2.trabalhorest.repositories.AutorRepository;
import com.web2.trabalhorest.models.Autor;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAllAutores(){
        return autorRepository.findAll();
    }

    public Optional<Autor> findAutorByID(long id){
        return autorRepository.findById(id);
    }

    public Autor saveAutor(Autor autor){
        return autorRepository.save(autor);
    }

    public void deleteAutorByID(long id){
        autorRepository.deleteById(id);
    }

    public List<String> getLivrosByAutor(Long autorId) {
        return autorRepository.findLivrosByAutorId(autorId);
    }
}
