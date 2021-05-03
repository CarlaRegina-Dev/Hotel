package com.carla.Hotel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carla.Hotel.Model.QuartoModel;
import com.carla.Hotel.Service.QuartoService;

@RestController 
@RequestMapping("/quarto")
public class QuartoController {
	
	@Autowired
	private QuartoService quartoServico;
	
	@GetMapping
	public List<QuartoModel> listaQuarto(){
		return quartoServico.listaQuarto();
	}
	
	@PostMapping
	public QuartoModel cadastrarQuarto(@RequestBody QuartoModel quarto) {
		return quartoServico.cadatrarQuarto(quarto);
	}
	
	@PutMapping
	public QuartoModel atualizarQuarto(@RequestBody QuartoModel quarto) {
		return quartoServico.atualizarQuarto(quarto);
	}
	
	@DeleteMapping ("/{id}")
	public void apagarCliente(@PathVariable Long id) {
		quartoServico.apagarQuarto(id);
	}
}
