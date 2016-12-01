package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Quarto {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idQuarto;
	private Integer numero;
	
	//Column Propieties
	
		@JoinColumn()
		@OneToOne(fetch=FetchType.EAGER)
		private QuartoType qType;
	
	//Getters & Setters
	//Id
	public Integer getIdQuarto() {
		return idQuarto;
	}
	public void setIdQuarto(Integer idQuarto) {
		this.idQuarto = idQuarto;
	}
	
	//Número
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
