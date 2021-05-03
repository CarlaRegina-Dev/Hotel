package com.carla.Hotel.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="quarto")
public class QuartoModel {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="idTipoQuarto",referencedColumnName="id") 
	private TipoQuartoModel tipoQuarto;
    private int numeroQuarto;
    private int andarQuarto;
    
    public QuartoModel (TipoQuartoModel tipoQuarto, int numeroQuarto, int andarQuarto) {
    	this.tipoQuarto=tipoQuarto;
    	this.numeroQuarto = numeroQuarto;
        this.andarQuarto = andarQuarto;
    }
    
 public QuartoModel(){
        
    }
	
	    public void setId(Long id) {
	    	this.id=id;
	    }
	
	    public Long getId() {
	    	return id;
	    }
	    
	    public int getNumeroQuarto() {
            return numeroQuarto;
        }

        public void setNumeroQuarto(int numeroQuarto) {
            this.numeroQuarto = numeroQuarto;
        }

        public int getAndarQuarto() {
            return andarQuarto;
        }

        public void setAndarQuarto(int andarQuarto) {
            this.andarQuarto = andarQuarto;
        }

        public TipoQuartoModel getTipoQuarto() {
            return tipoQuarto;
        }

        public void setTipoQuarto(TipoQuartoModel tipoQuarto) {
            this.tipoQuarto = tipoQuarto;
        }      	
}


