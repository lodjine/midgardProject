package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Phase {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String idPhase;
private String phase;
private Date dateDebut;
private Date dateSoldePhase;
private Date dateFin;
private String honoraires;
private boolean archi;
private boolean grosOeuvre;
private boolean metal;
private boolean bois;
private boolean voirie;
@OneToMany(cascade=CascadeType.PERSIST)
private List<Document> documents;
@ManyToOne(cascade=CascadeType.PERSIST)
private Projet projet;

@ManyToOne
private User chefProjet;

private String etat;
private Long delaiHjIng;
private Long delaiHjTech;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getIdPhase() {
	return idPhase;
}
public void setIdPhase(String idPhase) {
	this.idPhase = idPhase;
}
public String getPhase() {
	return phase;
}
public void setPhase(String phase) {
	this.phase = phase;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Date getDateSoldePhase() {
	return dateSoldePhase;
}
public void setDateSoldePhase(Date dateSoldePhase) {
	this.dateSoldePhase = dateSoldePhase;
}
public Date getDateFin() {
	return dateFin;
}
public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}
public String getHonoraires() {
	return honoraires;
}
public void setHonoraires(String honoraires) {
	this.honoraires = honoraires;
}
public boolean isArchi() {
	return archi;
}
public void setArchi(boolean archi) {
	this.archi = archi;
}
public boolean isGrosOeuvre() {
	return grosOeuvre;
}
public void setGrosOeuvre(boolean grosOeuvre) {
	this.grosOeuvre = grosOeuvre;
}
public boolean isMetal() {
	return metal;
}
public void setMetal(boolean metal) {
	this.metal = metal;
}
public boolean isBois() {
	return bois;
}
public void setBois(boolean bois) {
	this.bois = bois;
}
public boolean isVoirie() {
	return voirie;
}
public void setVoirie(boolean voirie) {
	this.voirie = voirie;
}
public List<Document> getDocuments() {
	return documents;
}
public void setDocuments(List<Document> documents) {
	this.documents = documents;
}
public User getChefProjet() {
	return chefProjet;
}
public void setChefProjet(User chefProjet) {
	this.chefProjet = chefProjet;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}
public Long getDelaiHjIng() {
	return delaiHjIng;
}
public void setDelaiHjIng(Long delaiHjIng) {
	this.delaiHjIng = delaiHjIng;
}
public Long getDelaiHjTech() {
	return delaiHjTech;
}
public void setDelaiHjTech(Long delaiHjTech) {
	this.delaiHjTech = delaiHjTech;
}
public Phase() {
	super();
	// TODO Auto-generated constructor stub
}
public Projet getProjet() {
	return projet;
}
public void setProjet(Projet projet) {
	this.projet = projet;
}






}
