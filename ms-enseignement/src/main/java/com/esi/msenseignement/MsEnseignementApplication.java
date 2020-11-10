package com.esi.msenseignement;

import com.esi.msenseignement.dao.EnseignantRepository;
import com.esi.msenseignement.dao.ModuleRepository;
import com.esi.msenseignement.dao.SeanceRepository;
import com.esi.msenseignement.entities.*;
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
public class MsEnseignementApplication  implements CommandLineRunner {

	@Autowired
	EnseignantRepository enseignantRepository ;

	@Autowired
	ModuleRepository moduleRepository ;

    @Autowired
	SeanceRepository seanceRepository  ;

	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MsEnseignementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repositoryRestConfiguration.exposeIdsFor(Enseignant.class);


		Enseignant e1=enseignantRepository.save(new Enseignant(null,"Malki","AbdelHamid", Sexe.homme, Date.valueOf("1999-01-01"),null));
		Enseignant e2=enseignantRepository.save(new Enseignant(null,"Elouali","Nadia", Sexe.homme, Date.valueOf("1989-01-01"),null));



		Module m1=moduleRepository.save(new Module(null,"TDM",5,1L,e1,null,null));
		Module m2=moduleRepository.save(new Module(null,"Java",4,2L,e2,null,null));

		Seance s1= seanceRepository.save(new Seance(null, Semaine.Dimanche,"10h","11h",m1))  ;
        Seance s2= seanceRepository.save(new Seance(null, Semaine.Lundi,"8h","10h",m1))  ;
        Seance s3= seanceRepository.save(new Seance(null, Semaine.Mardi,"10h","12h",m2))  ;



	}
}
