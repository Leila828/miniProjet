package com.esi.msexamen.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ModuleRepository extends JpaRepository<Module,Long> {
}
