package com.web2.trabalhorest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Set;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private double preco;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "livroCategoria", joinColumns = @JoinColumn(name = "livroId"), inverseJoinColumns = @JoinColumn(name = "categoriaId"))
    private Set<Categoria> categorias;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "livroAutor", joinColumns = @JoinColumn(name = "livroId"), inverseJoinColumns = @JoinColumn(name = "autorId"))
    private Set<Autor> autores;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
    
}
