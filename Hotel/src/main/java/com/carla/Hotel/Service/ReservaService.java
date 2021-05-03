package com.carla.Hotel.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carla.Hotel.Model.ReservaModel;
import com.carla.Hotel.Repository.ReservaRepository;

@Service
public class ReservaService {
	
	@Autowired	
	private ReservaRepository repositorio;
	
	public List<ReservaModel> listaReserva(){
		return repositorio.findAll();
	}
	
	public ReservaModel cadatrarReserva(ReservaModel reserva) {
		ReservaModel retornoReserva = repositorio.save(reserva);
		return retornoReserva;
	}
	
	public ReservaModel atualizarReserva(ReservaModel reserva) {
		ReservaModel retornoReserva = repositorio.save(reserva);
		return retornoReserva;
	}
	
	public void apagarReservae(Long id) {
		 repositorio.deleteById(id);
	}
}
