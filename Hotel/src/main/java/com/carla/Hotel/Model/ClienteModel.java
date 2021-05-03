package com.carla.Hotel.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="cliente")
public class ClienteModel {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="idEndereco",referencedColumnName="id") 
	private EnderecoModel endereco;
	private String nomeCliente;
    private String cpfCliente;
    private String emailCliente;
    private String telefone;
    private String dataNascimento;  
    
    public ClienteModel(EnderecoModel endereco, String nomeCliente, String cpfCliente, String emailCliente, 
    		String telefone, String dataNascimento) {
        this.endereco = endereco;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        
    }
    
    public ClienteModel() {
    	
    }
    
	    public void setId(Long id) {
			this.id=id;
		}
	    
	    public Long getId() {
			return id;
		}
	    
	    public String getNomeCliente() {
	        return nomeCliente;
	    }
	
	    public void setNomeCliente(String nomeCliente) {
	        this.nomeCliente = nomeCliente;
	    }
	
	    public String getCpfCliente() {
	        return cpfCliente;
	    }
	
	    public void setCpfCliente(String cpfCliente) {
	        this.cpfCliente = cpfCliente;
	    }
	
	    public String getEmailCliente() {
	        return emailCliente;
	    }
	
	    public void setEmailCliente(String emailCliente) {
	        this.emailCliente = emailCliente;
	    }
	
	    public String getTelefone() {
	        return telefone;
	    }
	
	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }
	
	    public String getDataNascimento() {
	        return dataNascimento;
	    }
	
	    public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }
	
	    public EnderecoModel getEndereco() {
	        return endereco;
	    }
	
	    public void setEndereco(EnderecoModel endereco) {
	        this.endereco = endereco;
	    }

}
