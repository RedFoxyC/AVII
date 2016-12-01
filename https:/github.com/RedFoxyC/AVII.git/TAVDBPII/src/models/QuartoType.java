package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import enuns.QuartoTipo;
@Entity
public class QuartoType {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idQType;
	private Double valor;
	private Integer maxPessoas;
	@Enumerated(EnumType.STRING)
	private QuartoTipo tipo;
	
	//Getters & Setters
	//Id
	public Integer getIdQType() {
		return idQType;
	}
	public void setIdQType(Integer idQType) {
		this.idQType = idQType;
	}
	
	//Valor
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	//Máximo de pessoas
	public Integer getMaxPessoas() {
		return maxPessoas;
	}
	public void setMaxPessoas(Integer maxPessoas) {
		this.maxPessoas = maxPessoas;
	}
	
	//Tipo de Quarto
	public QuartoTipo getTipo() {
		return tipo;
	}
	public void setTipo(QuartoTipo tipo) {
		this.tipo = tipo;
	}
	
}
