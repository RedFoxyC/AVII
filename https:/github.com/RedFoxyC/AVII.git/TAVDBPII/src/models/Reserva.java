package models;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Reserva {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReserva;
	private Integer numPessoas;
	private Date dataInicio;
	private Date dataSaida;
	
	//Column Propieties
	
		@JoinColumn(name="reserva_quarto")
		@OneToOne()
		private Quarto quarto;
		
		@JoinColumn(name="reserva_pessoa")
		@OneToOne()
		private Pessoa pessoa;
		
	//Getters & Setters
	//Id
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	
	//Número de pessoas
	public Integer getNumPessoas() {
		return numPessoas;
	}
	public void setNumPessoas(Integer numPessoas) {
		this.numPessoas = numPessoas;
	}
	
	//Data início da reserva
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	//Data do fim da reserva
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
}
