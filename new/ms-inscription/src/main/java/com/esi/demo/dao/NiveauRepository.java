package com.esi.demo.dao;

import com.esi.demo.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NiveauRepository extends JpaRepository<Niveau, Long> {
}
