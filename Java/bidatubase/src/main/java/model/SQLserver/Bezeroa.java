package model.SQLserver;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bezeroak")
public class Bezeroa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	@Column
	private String izena;
	@Column
	private String emaila;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getIzena() {
		return izena;
	}


	public void setIzena(String izena) {
		this.izena = izena;
	}


	public String getEmaila() {
		return emaila;
	}


	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}


	@Override
	public String toString() {
		return "Bezeroa [id=" + id + ", izena=" + izena + ", emaila=" + emaila + "]";
	}
	
	
}
