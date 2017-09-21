package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phase {
@Id
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
@OneToMany
private List<Document> documents;




}
