package com.esi.demo.api_controller;

import com.esi.demo.dao.EtudiantRepository;
import com.esi.demo.entities.Etudiant;

import com.esi.demo.proxy.BourseProxy;
import com.esi.demo.proxy.ExamenProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class InscriptionAPI {
    @Autowired
    EtudiantRepository etudiantRepository;
 @Autowired

    BourseProxy bourseProxy;


    @Autowired
    ExamenProxy examenProxy;
    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiantWithFormation(@PathVariable("id") Long ide)
    {
        Etudiant etudiant=etudiantRepository.findById(ide).get();


        etudiant.setVirements(new ArrayList<>(bourseProxy.getVirements(ide,"toscolarite").getContent()));

        return  etudiant;
    }

}
