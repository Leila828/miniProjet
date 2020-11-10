package com.esi.msexamen;

import com.esi.msexamen.Dao.EtudiantRepository;
import com.esi.msexamen.Dao.ExamenRepository;
import com.esi.msexamen.Dao.NoteRepository;
import com.esi.msexamen.entities.Etudiant;
import com.esi.msexamen.entities.Examen;
import com.esi.msexamen.entities.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients

public class MsExamenApplication implements CommandLineRunner {

	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	ExamenRepository examenRepository;
	@Autowired
	NoteRepository noteRepository;

	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MsExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Examen.class);

		Etudiant e1=etudiantRepository.save(new Etudiant(1L,14,null));
		Etudiant e2=etudiantRepository.save(new Etudiant(2L,15,null));

		Examen ex1=examenRepository.save(new Examen(null, Date.valueOf("1999-01-01"),null));
		Examen ex2=examenRepository.save(new Examen(null, Date.valueOf("1998-01-01"),null));

		Note n1=noteRepository.save(new Note(null,14,ex1,e1));
		Note n2=noteRepository.save(new Note(null,20,ex2,e2));

	}
}
