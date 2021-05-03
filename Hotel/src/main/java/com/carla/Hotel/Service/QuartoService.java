package com.carla.Hotel.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.carla.Hotel.Model.QuartoModel;
import com.carla.Hotel.Repository.QuartoRepository;

@Service
public class QuartoService {
	
private QuartoRepository repositorio;
	
	public List<QuartoModel> listaQuarto(){
		return repositorio.findAll();
	}
	
	public QuartoModel cadatrarQuarto(QuartoModel quarto) {
		QuartoModel retornoQuarto = repositorio.save(quarto);
		return retornoQuarto;
	}
	
	public QuartoModel atualizarQuarto(QuartoModel quarto) {
		QuartoModel retornoQuarto = repositorio.save(quarto);
		return retornoQuarto;
	}
	
	public void apagarQuarto(Long id) {
		 repositorio.deleteById(id);
	}
}
