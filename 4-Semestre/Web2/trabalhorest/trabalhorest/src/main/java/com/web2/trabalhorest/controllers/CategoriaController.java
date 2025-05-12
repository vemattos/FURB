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

import com.web2.trabalhorest.services.CategoriaService;
import com.web2.trabalhorest.models.Categoria;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> getAllCategorias(){
        List<Categoria> allCategorias = categoriaService.getAllCategorias();
        if (!allCategorias.isEmpty()) {
            return ResponseEntity.ok(allCategorias);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getCategoriaByID(@PathVariable @NotNull long id){
        Optional<Categoria> categoria = categoriaService.getCategoriaByID(id);
        if (categoria.isPresent()) {
            return ResponseEntity.ok(categoria.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria){
        Categoria novaCategoria = categoriaService.saveCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaCategoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> updateCategoria(@PathVariable @NotNull long id, @RequestBody Categoria categoria){
        Optional<Categoria> savedCategoria = categoriaService.getCategoriaByID(id);
        if (savedCategoria.isPresent()) {
            categoria.setId(id);
            Categoria categoriaUpdate = categoriaService.saveCategoria(categoria);
            return ResponseEntity.ok().body(categoriaUpdate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Categoria> deleteCategoria(@PathVariable @NotNull long id){
        categoriaService.deleteCategoriaByID(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/livros/{id}")
    public ResponseEntity<List<String>> livrosCategoria(@PathVariable @NotNull long id){
        List<String> livros = categoriaService.getLivrosByCategoria(id);
        if (!livros.isEmpty()) {
            return ResponseEntity.ok(livros);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
