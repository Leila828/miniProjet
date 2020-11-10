package com.esi.msexamen.Dao;

import com.esi.msexamen.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface NoteRepository extends JpaRepository<Note,Long> {
    List<Note> findNotesByEtudiant_IdEtudiant(Long ide);

}
