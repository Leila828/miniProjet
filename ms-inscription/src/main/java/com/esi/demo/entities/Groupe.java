package com.esi.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGroupe;
    private String nom;
    private int capacite;

    @JsonIgnore
    @OneToMany(mappedBy = "groupe")
    private Collection<Etudiant> LesEtudiants;

    @ManyToOne
    private Niveau niveau;

}
