package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tache {
@Id
private Long idBd;
@Column(unique=true)
private String idTache;

private String description;
@ManyToOne
private User operateur;

private Long etatAavancement;
@ManyToOne
private Statut statut;
public Long getIdBd() {
	return idBd;
}
public void setIdBd(Long idBd) {
	this.idBd = idBd;
}
public String getIdTache() {
	return idTache;
}
public void setIdTache(String idTache) {
	this.idTache = idTache;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public User getOperateur() {
	return operateur;
}
public void setOperateur(User operateur) {
	this.operateur = operateur;
}
public Long getEtatAavancement() {
	return etatAavancement;
}
public void setEtatAavancement(Long etatAavancement) {
	this.etatAavancement = etatAavancement;
}
public Statut getStatut() {
	return statut;
}
public void setStatut(Statut statut) {
	this.statut = statut;
}


}
