package com.carla.Hotel.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="pagamento")
public class PagamentoModel {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String dataPagamento;
    private double valorPagamento;

    public PagamentoModel (String dataPagamento, double valorPagamento) {
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
    }

    public PagamentoModel() {
        
    }
    
    public void setId(Long id) {
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}
	
	 public String getDataPagamento() {
         return dataPagamento;
     }

     public void setDataPagamento(String dataPagamento) {
         this.dataPagamento = dataPagamento;
     }

     public double getValorPagamento() {
         return valorPagamento;
     }

     public void setValorPagamento(double valorPagamento) {
         this.valorPagamento = valorPagamento;
     }

}
