package org.iset.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pari {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private String pari_mise;
	private String pari_montant ;
	public Pari() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPari_mise() {
		return pari_mise;
	}

	public void setPari_mise(String pari_mise) {
		this.pari_mise = pari_mise;
	}

	public String getPari_montant() {
		return pari_montant;
	}

	public void setPari_montant(String pari_montant) {
		this.pari_montant = pari_montant;
	}

	public Pari(Long id, Date date, String pari_mise, String pari_montant) {
		super();
		this.id = id;
		this.date = date;
		this.pari_mise = pari_mise;
		this.pari_montant = pari_montant;
	}

	


}
