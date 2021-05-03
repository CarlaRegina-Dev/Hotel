package com.carla.Hotel.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="endereco")
public class EnderecoModel {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String CEP;
	private  String rua;
	private int numeroCasa;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	public EnderecoModel (String CEP, String rua, int numeroCasa, String complemento, String bairro, 
			String cidade, String estado, String pais) {
		this.CEP=CEP;
		this.rua=rua;
		this.numeroCasa=numeroCasa;
		this.complemento=complemento;
		this.bairro=bairro;
		this.cidade=cidade;
		this.estado=estado;
		this.pais=pais;
		
	}
	
	public EnderecoModel() {
		
	}
		public void setId(Long id) {
			this.id=id;
		}
		
		public Long getId() {
			return id;
		}
		
		public void setCEP(String CEP) {
			this.CEP=CEP;
		}
		
		public void setRua(String rua) {
			this.rua=rua;
		}
		
		public void setNumeroCasa(int numeroCasa) {
			this.numeroCasa=numeroCasa;
		}
		
		public void setComplemto(String complemento) {
			this.complemento=complemento;
		}
		
		public void setBairro(String bairro) {
			this.bairro=bairro;
		}
		
		public void setEstado(String estado) {
			this.estado=estado;
		}
		
		public void setPais(String pais) {
			this.pais=pais;
		}
		
		public String getCEP() {
			return CEP;
		}
		
		public String getRua () {
			return rua;
		}
		
		public int getNumeroCasa() {
			return numeroCasa;
		}
		
		public String getComplemento() {
			return complemento;
		}
		
		public String getBairro() {
			return bairro;
		}
		
		public String getCidade() {
			return cidade;
		}
		
		public String getEstado() {
			return estado;
		}
		
		public String getPais() {
			return pais;
		}
			
}
