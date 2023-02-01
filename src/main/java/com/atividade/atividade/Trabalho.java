package com.atividade.atividade;

public class Trabalho {
	public String titulo;
	public String conteudo;
	public String autor;
	
	
	public Trabalho() {
	}
	
	public Trabalho(String titulo, String conteudo, String autor) {
		super();
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
