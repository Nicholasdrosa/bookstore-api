package com.valdir.bookstore;

import java.util.Objects;

import com.valdir.bookstore.domain.Categoria;

public class Livro {

	private Integer id;
	private String tituilo;
	private String nome_autor;
	private String texto;

	private Categoria categoria;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer id, String tituilo, String nome_autor, String texto, Categoria categoria) {
		super();
		this.id = id;
		this.tituilo = tituilo;
		this.nome_autor = nome_autor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTituilo() {
		return tituilo;
	}

	public void setTituilo(String tituilo) {
		this.tituilo = tituilo;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
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
