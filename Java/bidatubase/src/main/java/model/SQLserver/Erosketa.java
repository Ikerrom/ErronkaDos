package model.SQLserver;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="erosketak")
public class Erosketa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	@Column
	private String erreferentzia;
	@Column
	private String hornitzailea;
	@Column 
	private String eroslea;
	@Column
	private String produktua;
	@Column
	private int kopurua;
	@Column
	private int guztira;
	@Column
	private String egoera;
	
	@Override
	public String toString() {
		return "Erosketak [id=" + id + ", erreferentzia=" + erreferentzia + ", hornitzailea=" + hornitzailea
				+ ", eroslea=" + eroslea + ", produktua=" + produktua + ", kopurua=" + kopurua + ", guztira=" + guztira
				+ ", egoera=" + egoera + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getErreferentzia() {
		return erreferentzia;
	}
	public void setErreferentzia(String erreferentzia) {
		this.erreferentzia = erreferentzia;
	}
	public String getHornitzailea() {
		return hornitzailea;
	}
	public void setHornitzailea(String hornitzailea) {
		this.hornitzailea = hornitzailea;
	}
	public String getEroslea() {
		return eroslea;
	}
	public void setEroslea(String eroslea) {
		this.eroslea = eroslea;
	}
	public String getProduktua() {
		return produktua;
	}
	public void setProduktua(String produktua) {
		this.produktua = produktua;
	}
	public int getKopurua() {
		return kopurua;
	}
	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
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
	
}
