package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Tache;

public interface TacheDao extends JpaRepository<Tache, Serializable>{

}
