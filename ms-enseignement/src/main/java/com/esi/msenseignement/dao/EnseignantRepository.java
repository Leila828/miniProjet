package com.esi.msenseignement.dao;

import com.esi.msenseignement.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
}
