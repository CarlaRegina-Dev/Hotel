package com.carla.Hotel.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity 
@Table(name="reserva")
public class ReservaModel {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="idCliente",referencedColumnName="id") 
	private ClienteModel cliente;
	
	@ManyToOne
	@JoinColumn(name="idQuarto",referencedColumnName="id") 
	private QuartoModel quarto;
	
	@ManyToOne
	@JoinColumn(name="idPagamento",referencedColumnName="id") 
	private PagamentoModel pagamento;
	
	private String dataInicio;
    private String dataFim;
    private boolean status;
    
    public ReservaModel(ClienteModel cliente, QuartoModel quarto, PagamentoModel pagamento, String dataInicio, String dataFim, boolean status) {
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.pagamento = pagamento;
        this.cliente = cliente;
    }

    public ReservaModel() {
        
    }
    
	    public void setId(Long id) {
			this.id=id;
		}
	    
	    public Long getId() {
			return id;
		}
	    
	    public ClienteModel getCliente() {
	        return cliente;
	    }
	    
	    public void setCliente(ClienteModel cliente) {
	        this.cliente = cliente;
	    }   
	
	    public QuartoModel getQuarto() {
	        return quarto;
	    }
	
	    public void setQuarto(QuartoModel quarto) {
	        this.quarto = quarto;
	    }
	    
	    public PagamentoModel getPagamento() {
	        return pagamento;
	    }
	
	    public void setPagamento(PagamentoModel pagamento) {
	        this.pagamento = pagamento;
	    }
	
	    public String getDataInicio() {
	        return dataInicio;
	    }
	
	    public void setDataInicio(String dataInicio) {
	        this.dataInicio = dataInicio;
	    }
	
	    public String getDataFim() {
	        return dataFim;
	    }
	
	    public void setDataFim(String dataFim) {
	        this.dataFim = dataFim;
	    }
	
	    public boolean getStatus() {
	        return status;
	    }
	
	    public void setStatus(boolean status) {
	        this.status = status;
	    }    
}
