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
import com.carla.Hotel.Model.ReservaModel;
import com.carla.Hotel.Service.ReservaService;


@RestController 
@RequestMapping("/reserva")
public class ReservaController {
	
	@Autowired
	private ReservaService reservaServico;
	
	@GetMapping
	public List<ReservaModel> listaReserva(){
		return reservaServico.listaReserva();
	}
	
	@PostMapping
	public ReservaModel cadastrarReserva(@RequestBody ReservaModel reserva) {
		return reservaServico.cadatrarReserva(reserva);
	}
	
	@PutMapping
	public ReservaModel atualizarReserva(@RequestBody ReservaModel reserva) {
		return reservaServico.atualizarReserva(reserva);
	}
	
	@DeleteMapping ("/{id}")
	public void apagarReserva(@PathVariable Long id) {
		reservaServico.apagarReservae(id);
	}
}
