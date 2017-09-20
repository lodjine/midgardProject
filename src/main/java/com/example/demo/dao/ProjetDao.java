package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Projet;



public interface ProjetDao extends JpaRepository<Projet, Serializable>{

}
