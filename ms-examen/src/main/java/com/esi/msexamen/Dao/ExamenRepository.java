package com.esi.msexamen.Dao;

import com.esi.msexamen.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExamenRepository extends JpaRepository<Examen,Long> {
}
