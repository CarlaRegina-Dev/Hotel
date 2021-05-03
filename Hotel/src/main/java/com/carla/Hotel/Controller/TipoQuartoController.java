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

import com.carla.Hotel.Model.TipoQuartoModel;
import com.carla.Hotel.Service.TipoQuartoService;

@RestController 
@RequestMapping("/tipoquarto")
public class TipoQuartoController {
	
	@Autowired
	private TipoQuartoService tipoQuartoServico;
	
	@GetMapping
	public List<TipoQuartoModel> listaTipoQuarto(){
		return tipoQuartoServico.listaTipoQuarto();
	}
	
	@PostMapping
	public TipoQuartoModel cadastrarTipoQuarto(@RequestBody TipoQuartoModel tipoQuarto) {
		return tipoQuartoServico.cadastrarTipoQuarto(tipoQuarto);
	}
	
	@PutMapping
	public TipoQuartoModel atualizarTipoQuarto(@RequestBody TipoQuartoModel tipoQuarto) {
		return tipoQuartoServico.atualizarTipoQuarto(tipoQuarto);
	}
	
	@DeleteMapping ("/{id}")
	public void apagarTipoQuarto(@PathVariable Long id) {
		tipoQuartoServico.apagarTipoQuarto(id);
	}
}
