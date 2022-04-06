package org.iset.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Sport {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String catégorie;
	private String nom;
	private String Description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCatégorie() {
		return catégorie;
	}
	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sport(Long id, String catégorie, String nom, String description) {
		super();
		this.id = id;
		this.catégorie = catégorie;
		this.nom = nom;
		Description = description;
	}
	
}
