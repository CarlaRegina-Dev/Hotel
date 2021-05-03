package com.carla.Hotel.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carla.Hotel.Model.*;
import com.carla.Hotel.Repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired	
	private EnderecoRepository repositorio;
	
	public List<EnderecoModel> listaEndereco(){
		return repositorio.findAll();
	}
	
	public EnderecoModel cadastrarEndereco(EnderecoModel endereco) {
		EnderecoModel retornoEndereco = repositorio.save(endereco);
		return retornoEndereco;
	}
	
	public EnderecoModel atualizarEndereco(EnderecoModel endereco) {
		EnderecoModel retornoEndereco = repositorio.save(endereco);
		return retornoEndereco;
	}
	
	public void apagarEndereco(Long id) {
		 repositorio.deleteById(id);
	}
}
