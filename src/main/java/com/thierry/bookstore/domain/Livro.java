package com.thierry.bookstore.domain;

import java.util.Objects;

public class Livro {
	
	
	private Integer id;
	private String titulo;
	private String nome_auth;
	private String texto;
	private Categoria categoria;
	
	
	
	
	public Livro() {
		super();
	}




	public Livro(Integer id, String titulo, String nome_auth, String texto) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nome_auth = nome_auth;
		this.texto = texto;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getNome_auth() {
		return nome_auth;
	}




	public void setNome_auth(String nome_auth) {
		this.nome_auth = nome_auth;
	}




	public String getTexto() {
		return texto;
	}




	public void setTexto(String texto) {
		this.texto = texto;
	}




	public Categoria getCategoria() {
		return categoria;
	}




	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}




	@Override
	public int hashCode() {
		return Objects.hash(id);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
