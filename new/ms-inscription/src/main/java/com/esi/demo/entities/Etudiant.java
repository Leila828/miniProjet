package com.esi.demo.entities;

import com.esi.demo.model.EtudiantBourse;
import com.esi.demo.model.EtudiantExamen;
import com.esi.demo.model.EtudiantVirement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nom;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateN;

    private String sexe;


    @ManyToOne
    private Groupe groupe;
    @Transient
    List<EtudiantVirement> virements;




}