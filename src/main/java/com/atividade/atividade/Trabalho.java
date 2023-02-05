package com.atividade.atividade;
import javax.persistence.*;

@Entity
@Table(name = "Trabalho")

public class Trabalho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	public long id;

	@Column(name = "titulo", length = 20)
	public String titulo;

	@Column(name = "conteudo", length = 50)
	public String conteudo;
	
	@Column(name = "autor", length = 20)
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
