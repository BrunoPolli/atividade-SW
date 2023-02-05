package com.atividade.atividade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controllers {

	@Autowired TrabalhoRepository trabalhoRepository;
	
	@GetMapping("/trabalhos")
	public List<Trabalho> listsAll(){
		
		return trabalhoRepository.findAll();
	}
	
	@PostMapping(value = "/enviar", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus( HttpStatus.OK )
	public Trabalho createTrabalho(@RequestBody Trabalho trabalho) {

		Trabalho t = new Trabalho();
		
		t.setTitulo(trabalho.getTitulo());
		t.setConteudo(trabalho.getConteudo());
		t.setAutor(trabalho.getAutor());
		
		return trabalhoRepository.save(trabalho);
		
	}
	
	@PutMapping("/alterar/{id}")
	public Trabalho updateTrabalho(@RequestBody Trabalho trabalho, @PathVariable Long id) {
		
		Trabalho t = trabalhoRepository.getReferenceById(id);
		t.setTitulo(trabalho.getTitulo());
		t.setConteudo(trabalho.getConteudo());
		t.setAutor(trabalho.getAutor());
		
		
		return trabalhoRepository.save(t);
	}
	
	@DeleteMapping("/deletar/{id}")
	@ResponseStatus( HttpStatus.OK )
	public String deleteTrabalho(@PathVariable Long id) {
			
		trabalhoRepository.deleteById(id);
		
		return "Deleted!";
	
	}
	
}
