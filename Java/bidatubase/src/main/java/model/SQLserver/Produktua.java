package model.SQLserver;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Produktua implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	@Column
	private String izena;
	@Column
	private String deskripzioa;
	@Column
	private int prezioa;
	@Column
	private int bolumena;
	@Column
	private int pisua;
	
	
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


	public String getDeskripzioa() {
		return deskripzioa;
	}


	public void setDeskripzioa(String deskripzioa) {
		this.deskripzioa = deskripzioa;
	}


	public int getPrezioa() {
		return prezioa;
	}


	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}


	public int getBolumena() {
		return bolumena;
	}


	public void setBolumena(int bolumena) {
		this.bolumena = bolumena;
	}


	public int getPisua() {
		return pisua;
	}


	public void setPisua(int pisua) {
		this.pisua = pisua;
	}


	@Override
	public String toString() {
		return "Produktua [id=" + id + ", izena=" + izena + ", deskripzioa=" + deskripzioa + ", prezioa=" + prezioa
				+ ", bolumena=" + bolumena + ", pisua=" + pisua + "]";
	}
	
	
}
