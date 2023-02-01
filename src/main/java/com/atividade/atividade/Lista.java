package com.atividade.atividade;

import java.util.List;
import java.util.ArrayList;

public class Lista {

	public List<Trabalho> list = new ArrayList<>();
	
	public void addTrabalho(Trabalho trabalho) {
		list.add(trabalho);
	}

	public void showTrabalhos() {
		for (Trabalho trabalho: list) {
			System.out.println(trabalho.getAutor() + " " + trabalho.getConteudo() +  " " + trabalho.getAutor());
		}
	}
	
}
