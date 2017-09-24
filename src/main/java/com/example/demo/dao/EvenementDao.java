package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Evenement;

public interface EvenementDao extends JpaRepository<Evenement, Long>{

}
