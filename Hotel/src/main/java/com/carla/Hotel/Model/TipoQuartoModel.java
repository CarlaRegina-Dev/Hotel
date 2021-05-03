package com.carla.Hotel.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tipoquarto")
public class TipoQuartoModel {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String descricao;
     
     public TipoQuartoModel(String descricao) {
        this.descricao = descricao;
    }

    public TipoQuartoModel() {
        
    }
	    
	    public void setId(Long id) {
			this.id=id;
		}
	    
	    public Long getId() {
			return id;
		}
	    
	    public String getDescricao() {
	        return descricao;
	    }
	
	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }  
}

