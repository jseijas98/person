package com.example.person.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.example.person.model.Persona;

public interface RepoPersona extends JpaRepository<Persona, Long>{

}