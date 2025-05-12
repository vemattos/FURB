package com.web2.trabalhorest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.constraints.NotNull;

import com.web2.trabalhorest.services.AutorService;
import com.web2.trabalhorest.models.Autor;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    public ResponseEntity<List<Autor>> getAllAutores(){
        List<Autor> autores = autorService.getAllAutores();
        if (!autores.isEmpty()) {
            return ResponseEntity.ok(autores);
        } else {
            return ResponseEntity.notFound().build();            
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getAutorByID(@PathVariable @NotNull long id){
        Optional<Autor> autor = autorService.findAutorByID(id);
        if (autor.isPresent()) {
            return ResponseEntity.ok(autor.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Autor> createAutor(@RequestBody Autor autor) {
        Autor novoAutor = autorService.saveAutor(autor);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAutor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> updateAutor(@PathVariable @NotNull long id, @RequestBody Autor autor) {
        Optional<Autor> savedAutor = autorService.findAutorByID(id);
        if (savedAutor.isPresent()) {
        	autor.setId(id);
            Autor autorUpdate = autorService.saveAutor(autor);
            return ResponseEntity.ok().body(autorUpdate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Autor> deleteAutor(@PathVariable @NotNull long id){
        autorService.deleteAutorByID(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/livros/{id}")
    public ResponseEntity<List<String>> livrosAutor(@PathVariable @NotNull long id){
        List<String> livros = autorService.getLivrosByAutor(id);
        if (!livros.isEmpty()) {
            return ResponseEntity.ok(livros);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
