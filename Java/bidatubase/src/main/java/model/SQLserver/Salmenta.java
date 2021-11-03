package model.SQLserver;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salmentak")
public class Salmenta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	@Column
	private String zenbakia;
	@Column
	private String data;
	@Column
	private String bezeroa;
	@Column
	private String komertziala;
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


	public String getZenbakia() {
		return zenbakia;
	}


	public void setZenbakia(String zenbakia) {
		this.zenbakia = zenbakia;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getBezeroa() {
		return bezeroa;
	}


	public void setBezeroa(String bezeroa) {
		this.bezeroa = bezeroa;
	}


	public String getKomertziala() {
		return komertziala;
	}


	public void setKomertziala(String komertziala) {
		this.komertziala = komertziala;
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
		return "Salmenta [id=" + id + ", zenbakia=" + zenbakia + ", data=" + data + ", bezeroa=" + bezeroa
				+ ", komertziala=" + komertziala + ", guztira=" + guztira + ", egoera=" + egoera + "]";
	}
	
}