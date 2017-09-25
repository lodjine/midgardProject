package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

private String userName;

private String password;

private String nom;

private String prenom;

private String role;

private Boolean interne;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}



public Boolean getInterne() {
	return interne;
}

public void setInterne(Boolean interne) {
	this.interne = interne;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}

}
