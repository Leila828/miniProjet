package com.esi.demo.entities;

import com.esi.demo.model.EtudiantNote;
import com.esi.demo.model.EtudiantVirement;
import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @JsonBackReference
    @ManyToOne
    private Groupe groupe;

    @Transient
    List<EtudiantVirement> virements;

    @Transient
    List<EtudiantNote> notes;




}