package org.iset.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class Moubrate {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private Date deb_match;
private Date fin_match;
private Long Sport_id;
	@ManyToOne
	private Admin admin;

	public Moubrate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDeb_match() {
		return deb_match;
	}

	public void setDeb_match(Date deb_match) {
		this.deb_match = deb_match;
	}

	public Date getFin_match() {
		return fin_match;
	}

	public void setFin_match(Date fin_match) {
		this.fin_match = fin_match;
	}

	public Long getSport_id() {
		return Sport_id;
	}

	public void setSport_id(Long sport_id) {
		Sport_id = sport_id;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Moubrate(Long id, Date deb_match, Date fin_match, Long sport_id, Admin admin) {
		super();
		this.id = id;
		this.deb_match = deb_match;
		this.fin_match = fin_match;
		Sport_id = sport_id;
		this.admin = admin;
	}
	

}
