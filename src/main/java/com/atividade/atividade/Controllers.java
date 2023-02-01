package com.atividade.atividade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	
	
	Lista list = new Lista();
	
	@GetMapping("/trabalhos")
	public Lista carregarTrabalhos() {
		
		return list;
		
		
	}
	
	@PostMapping(value = "/enviar", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus( HttpStatus.OK )
	public String inserirTrabalho(@RequestBody Trabalho trabalho) {

		Trabalho t = new Trabalho();
		
		t.setTitulo(trabalho.getTitulo());
		t.setConteudo(trabalho.getConteudo());
		t.setAutor(trabalho.getAutor());
		
		list.addTrabalho(t);
		
		return "Trabalho adicionado!";
		
	}
}
