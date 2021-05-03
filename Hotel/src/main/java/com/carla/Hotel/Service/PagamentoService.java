package com.carla.Hotel.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carla.Hotel.Model.PagamentoModel;
import com.carla.Hotel.Repository.PagamentoRepository;

@Service
public class PagamentoService {
	
	@Autowired	
	private PagamentoRepository repositorio;
	
	public List<PagamentoModel> listaPagamento(){
		return repositorio.findAll();
	}
	
	public PagamentoModel cadastrarPagamento(PagamentoModel pagamento) {
		PagamentoModel retornoPagamento = repositorio.save(pagamento);
		return retornoPagamento;
	}
	
	public PagamentoModel atualizarPagamento(PagamentoModel pagamento) {
		PagamentoModel retornoPagamento = repositorio.save(pagamento);
		return retornoPagamento;
	}
	
	public void apagarPagamento(Long id) {
		 repositorio.deleteById(id);
	}
}
