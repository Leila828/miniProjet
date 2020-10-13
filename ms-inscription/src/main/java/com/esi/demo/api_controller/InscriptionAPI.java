package com.esi.demo.api_controller;

import com.esi.demo.dao.EtudiantRepository;
import com.esi.demo.entities.Etudiant;
import com.esi.demo.proxy.BourseProxy;
import com.esi.demo.proxy.ExamenProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class InscriptionAPI {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    BourseProxy bourseProxy;

    @Autowired
    ExamenProxy examenProxy;

    @GetMapping("/etudiant/{id}/bourse")
    Etudiant getEtudiantWithBourse(@PathVariable("id") Long id)
    {
        Etudiant etudiant=etudiantRepository.findById(id).get();
        etudiant.setEtudiantBourse(bourseProxy.getEtudiantBourse(id,"toInscription"));
        return etudiant;
    }

    @GetMapping("/etudiant/{id}/examen")
    Etudiant getEtudiantWithExamen(@PathVariable("id") Long id)
    {
        Etudiant etudiant=etudiantRepository.findById(id).get();
        etudiant.setEtudiantExamen(examenProxy.getEtudiantExamen(id,"toInscription"));
        return etudiant;
    }
}
