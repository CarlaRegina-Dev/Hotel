package com.carla.Hotel.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carla.Hotel.Model.ClienteModel;
import com.carla.Hotel.Repository.*;

@Service
public class ClienteService {
	
	@Autowired	
	private ClienteRepository repositorio;
	
	public List<ClienteModel> listaCliente(){
		return repositorio.findAll();
	}
	
	public ClienteModel cadatrarCliente(ClienteModel cliente) {
		ClienteModel retornoCliente = repositorio.save(cliente);
		return retornoCliente;
	}
	
	public ClienteModel atualizarCliente(ClienteModel cliente) {
		ClienteModel retornoCliente = repositorio.save(cliente);
		return retornoCliente;
	}
	
	public void apagarCliente(Long id) {
		 repositorio.deleteById(id);
	}
	
}
