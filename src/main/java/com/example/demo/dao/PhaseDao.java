package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Phase;

public interface PhaseDao extends JpaRepository<Phase, Serializable> {

}
