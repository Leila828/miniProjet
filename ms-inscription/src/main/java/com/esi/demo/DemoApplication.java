package com.esi.demo;

import com.esi.demo.dao.EtudiantRepository;
import com.esi.demo.dao.GroupeRepository;
import com.esi.demo.dao.NiveauRepository;
import com.esi.demo.entities.Etudiant;
import com.esi.demo.entities.Groupe;
import com.esi.demo.entities.Niveau;
import com.esi.demo.entities.Sexe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class DemoApplication implements CommandLineRunner {
	@Autowired
	EtudiantRepository etudiantRepository;

	@Autowired
	GroupeRepository groupeRepository;

	@Autowired
	NiveauRepository niveauRepository;

	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);}

	@Override
		public void run (String...args) throws Exception {


			Niveau n1 = niveauRepository.save(new Niveau(null, "Prépa", null));
			Niveau n2 = niveauRepository.save(new Niveau(null, "CS", null));

			Groupe G1 = groupeRepository.save(new Groupe(null, "G1-CP", 20, null , n1));
			Groupe G2 = groupeRepository.save(new Groupe(null, "G2-CP", 24, null , n1));
			Groupe G11 = groupeRepository.save(new Groupe(null, "G1-CS", 22, null , n2));
			Groupe G22 = groupeRepository.save(new Groupe(null, "G2-CS", 20, null , n2));

			etudiantRepository.save(new Etudiant(null, "malki","malki", Date.valueOf("1999-01-01"), Sexe.homme, G1,null,null));
			etudiantRepository.save(new Etudiant(null, "ali","malki", Date.valueOf("1995-08-11"), Sexe.homme, G2,null,null));
			etudiantRepository.save(new Etudiant(null, "karim","malki", Date.valueOf("1996-11-22"), Sexe.homme, G11,null,null));
			etudiantRepository.save(new Etudiant(null, "fouad","malki", Date.valueOf("2000-02-15"), Sexe.homme, G22,null,null));


		}
	}

