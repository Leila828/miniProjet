package com.esi.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.minidev.json.annotate.JsonIgnore;
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

    @JsonManagedReference
    @OneToMany(mappedBy = "groupe")
    private Collection<Etudiant> LesEtudiants;

    @JsonBackReference
    @ManyToOne
    private Niveau niveau;

}
