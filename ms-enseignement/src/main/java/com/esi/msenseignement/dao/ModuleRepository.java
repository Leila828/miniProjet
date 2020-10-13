package com.esi.msenseignement.dao;

import com.esi.msenseignement.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ModuleRepository extends JpaRepository<Module,Long> {
}
