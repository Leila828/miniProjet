package com.esi.msenseignement.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnseignant;
    private String nom;
    private String prenom;
    private String sexe;
    @Temporal(TemporalType.DATE)
    private Date dateN;
    @OneToMany(mappedBy = "enseignant")
    private Collection<Module> module;


}
