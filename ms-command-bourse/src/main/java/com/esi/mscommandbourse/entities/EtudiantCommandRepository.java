package com.esi.mscommandbourse.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtudiantCommandRepository extends JpaRepository <Etudiant,String> {
}
