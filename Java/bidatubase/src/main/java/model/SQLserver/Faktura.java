package model.SQLserver;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="fakturak")
public class Faktura implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	@Column
	private String izena;
	@Column
	private String data;
	@Column
	private String hornitzailea;
	@Column
	private int bez;
	@Column
	private int guztira;
	@Column
	private String egoera;
	
	
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


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHornitzailea() {
		return hornitzailea;
	}


	public void setHornitzailea(String hornitzailea) {
		this.hornitzailea = hornitzailea;
	}


	public int getBez() {
		return bez;
	}


	public void setBez(int bez) {
		this.bez = bez;
	}


	public int getGuztira() {
		return guztira;
	}


	public void setGuztira(int guztira) {
		this.guztira = guztira;
	}


	public String getEgoera() {
		return egoera;
	}


	public void setEgoera(String egoera) {
		this.egoera = egoera;
	}


	@Override
	public String toString() {
		return "Faktura [id=" + id + ", izena=" + izena + ", data=" + data + ", hornitzailea=" + hornitzailea + ", bez="
				+ bez + ", guztira=" + guztira + ", egoera=" + egoera + "]";
	}
	
	
}
