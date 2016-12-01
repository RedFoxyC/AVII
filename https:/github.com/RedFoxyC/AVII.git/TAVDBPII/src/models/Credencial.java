package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import enuns.Level;

@Entity
public class Credencial {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idCredencial;
	private static String login;
	private static String senha;
	@Enumerated(EnumType.STRING)
	private Level level;
	
	//Column Propieties
	
	@JoinColumn()
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Pessoa pessoa;
	
	//Getters & Setters
	//IdCredencial
	public String getIdCredencial() {
		return idCredencial;
	}
	public void setIdCredencial(String idCredencial) {
		this.idCredencial = idCredencial;
	}
	
	//Login
	public static String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		Credencial.login = login;
	}
	
	//Senha
	public static String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//Level
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	
	
	
}
