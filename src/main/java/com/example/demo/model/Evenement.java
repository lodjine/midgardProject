package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Evenement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvenement;
	@OneToOne
	@JoinColumn(name = "idProjet")
	@Cascade({ CascadeType.DELETE, CascadeType.PERSIST })
	private Projet idProjet;
	@OneToOne
	@JoinColumn(name = "idPhase")
	@Cascade({ CascadeType.DELETE, CascadeType.PERSIST })
	private Phase idPhase;

	private String docAtransm;

	private String etat;

	private String etatAvcmt;

	private String quantificationDelai;

	private Date dateDebut;

	private Date echeance;

	private Date dateFin;

	private String priorite;


	private Boolean plans;
	private Boolean noteCalcul;
	private Boolean quantitif;
	private Boolean modele3d;
	private Boolean rapport;
	
	

	@ManyToOne
	private Statut statut;



	public Long getIdEvenement() {
		return idEvenement;
	}



	public void setIdEvenement(Long idEvenement) {
		this.idEvenement = idEvenement;
	}



	public Projet getIdProjet() {
		return idProjet;
	}



	public void setIdProjet(Projet idProjet) {
		this.idProjet = idProjet;
	}



	public Phase getIdPhase() {
		return idPhase;
	}



	public void setIdPhase(Phase idPhase) {
		this.idPhase = idPhase;
	}



	public String getDocAtransm() {
		return docAtransm;
	}



	public void setDocAtransm(String docAtransm) {
		this.docAtransm = docAtransm;
	}



	public String getEtat() {
		return etat;
	}



	public void setEtat(String etat) {
		this.etat = etat;
	}



	public String getEtatAvcmt() {
		return etatAvcmt;
	}



	public void setEtatAvcmt(String etatAvcmt) {
		this.etatAvcmt = etatAvcmt;
	}



	public String getQuantificationDelai() {
		return quantificationDelai;
	}



	public void setQuantificationDelai(String quantificationDelai) {
		this.quantificationDelai = quantificationDelai;
	}



	public Date getDateDebut() {
		return dateDebut;
	}



	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}



	public Date getEcheance() {
		return echeance;
	}



	public void setEcheance(Date echeance) {
		this.echeance = echeance;
	}



	public Date getDateFin() {
		return dateFin;
	}



	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}



	public String getPriorite() {
		return priorite;
	}



	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}



	public Boolean getPlans() {
		return plans;
	}



	public void setPlans(Boolean plans) {
		this.plans = plans;
	}



	public Boolean getNoteCalcul() {
		return noteCalcul;
	}



	public void setNoteCalcul(Boolean noteCalcul) {
		this.noteCalcul = noteCalcul;
	}



	public Boolean getQuantitif() {
		return quantitif;
	}



	public void setQuantitif(Boolean quantitif) {
		this.quantitif = quantitif;
	}



	public Boolean getModele3d() {
		return modele3d;
	}



	public void setModele3d(Boolean modele3d) {
		this.modele3d = modele3d;
	}



	public Boolean getRapport() {
		return rapport;
	}



	public void setRapport(Boolean rapport) {
		this.rapport = rapport;
	}



	public Statut getStatut() {
		return statut;
	}



	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	

}
