package com.example.biblioteca.model;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 100)
    private String nome;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 100)
    private String descricao;

    @NotNull
    @NotBlank
    @Length(min = 5, max = 100)
    private double preco;

    @ManyToMany
    @JoinTable(name = "livroCategoria", joinColumns = @JoinColumn(name = "livroId"), inverseJoinColumns = @JoinColumn(name = "categoriaId"))
    private Set<Categoria> categorias;

    @ManyToMany
    @JoinTable(name = "livroAutor", joinColumns = @JoinColumn(name = "livroId"), inverseJoinColumns = @JoinColumn(name = "autorId"))
    private Set<Autor> autores;
}

