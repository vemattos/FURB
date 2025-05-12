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

import com.web2.trabalhorest.services.LivroService;
import com.web2.trabalhorest.models.Livro;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/biblioteca")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @GetMapping
    public ResponseEntity<List<Livro>> getAllLivros() {
        List<Livro> allLivros = livroService.getAllLivros();
        if (!allLivros.isEmpty()) {
            return ResponseEntity.ok(allLivros);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getLivroByID(@PathVariable @NotNull long id) {
        Optional<Livro> livro = livroService.getLivroByID(id);
        if (livro.isPresent()) {
            return ResponseEntity.ok(livro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Livro> createLivro(@RequestBody Livro livro) {
        Livro novoLivro = livroService.saveLivro(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> updateLivro(@PathVariable @NotNull long id, @RequestBody Livro livro) {
        Optional<Livro> livroSalvo = livroService.getLivroByID(id);
        if (livroSalvo.isPresent()) {
            livro.setId(id);
            Livro livroUpdate = livroService.saveLivro(livro);
            return ResponseEntity.ok().body(livroUpdate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Livro> deleteLivro(@PathVariable @NotNull long id) {
        livroService.deleteLivroByID(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<Livro>> getLivroByCategoria(@PathVariable Long id) {
        List<Livro> livros = livroService.getLivroByCategoria(id);
        if (livros.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(livros);
    }

    @GetMapping("/autor/{id}")
    public ResponseEntity<List<Livro>> getLivroByAutor(@PathVariable Long id) {
        List<Livro> livros = livroService.getLivroByAutor(id);
        if (livros.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(livros);
    }
}
