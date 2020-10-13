package com.esi.demo.dao;

import com.esi.demo.entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
}