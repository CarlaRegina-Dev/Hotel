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

import com.carla.Hotel.Model.EnderecoModel;
import com.carla.Hotel.Service.EnderecoService;

@RestController 
@RequestMapping("/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoServico;
	
	@GetMapping
	public List<EnderecoModel> listaEndereco(){
		return enderecoServico.listaEndereco();
	}
	
	@PostMapping
	public EnderecoModel cadastrarEndereco(@RequestBody EnderecoModel endereco) {
		return enderecoServico.cadastrarEndereco(endereco);
	}
	
	@PutMapping
	public EnderecoModel atualizarEndereco(@RequestBody EnderecoModel endereco) {
		return enderecoServico.atualizarEndereco(endereco);
	}
	
	@DeleteMapping ("/{id}")
	public void apagarEndereco(@PathVariable Long id) {
		enderecoServico.apagarEndereco(id);
	}
}
