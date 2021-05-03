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

import com.carla.Hotel.Model.PagamentoModel;
import com.carla.Hotel.Service.PagamentoService;

@RestController 
@RequestMapping("/pagamento")
public class PagamentoController {
	
	@Autowired
	private PagamentoService pagamentoServico;
	
	@GetMapping
	public List<PagamentoModel> listaPagamento(){
		return pagamentoServico.listaPagamento();
	}
	
	@PostMapping
	public PagamentoModel cadastrarPagamento(@RequestBody PagamentoModel pagamento) {
		return pagamentoServico.cadastrarPagamento(pagamento);
	}
	
	@PutMapping
	public PagamentoModel atualizarPagamento(@RequestBody PagamentoModel pagamento) {
		return pagamentoServico.cadastrarPagamento(pagamento);
	}
	
	@DeleteMapping ("/{id}")
	public void apagarPagamento(@PathVariable Long id) {
		pagamentoServico.apagarPagamento(id);
	}
}
