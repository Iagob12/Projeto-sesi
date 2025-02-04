package com.sesi.projeto.entities;

import java.util.HashSet;
import java.util.Set;

import com.sesi.projeto.dto.CategoriaDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	

	@ManyToMany(mappedBy = "categorias")
	private Set<Produto> produto = new HashSet<>();
	
	public Categoria(long id, String nome) {
		this.id = id;
		this.nome = nome;
		
	}
	
	public Categoria(CategoriaDto d) {
		this.nome = d.nome();
	}

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

}
