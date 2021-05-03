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
import com.carla.Hotel.Model.ClienteModel;
import com.carla.Hotel.Service.ClienteService;

@RestController 
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteServico;
	
	@GetMapping
	public List<ClienteModel> listaCliente(){
		return clienteServico.listaCliente();
	}
	
	@PostMapping
	public ClienteModel cadastrarCliente(@RequestBody ClienteModel cliente) {
		return clienteServico.cadatrarCliente(cliente);
	}
	
	@PutMapping
	public ClienteModel atualizarCliente(@RequestBody ClienteModel cliente) {
		return clienteServico.atualizarCliente(cliente);
	}
	
	@DeleteMapping ("/{id}")
	public void apagarCliente(@PathVariable Long id) {
		clienteServico.apagarCliente(id);
	}
}
