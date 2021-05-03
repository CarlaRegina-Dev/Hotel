package com.carla.Hotel.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;
import com.carla.Hotel.Model.TipoQuartoModel;
import com.carla.Hotel.Repository.TipoQuartoRepository;

@Service
public class TipoQuartoService {
	
	@Autowired
	private TipoQuartoRepository repositorio;
	
	public List<TipoQuartoModel> listaTipoQuarto(){
		return repositorio.findAll();
	}
	
	public TipoQuartoModel cadastrarTipoQuarto(TipoQuartoModel tipoQuarto) {
		TipoQuartoModel retornoTipoQuarto = repositorio.save(tipoQuarto);
		return retornoTipoQuarto;
	}
	
	public TipoQuartoModel atualizarTipoQuarto(TipoQuartoModel tipoQuarto) {
		TipoQuartoModel retornoTipoQuarto = repositorio.save(tipoQuarto);
		return retornoTipoQuarto;
	}
	
	public void apagarTipoQuarto(Long id) {
		 repositorio.deleteById(id);
	}

}
