package com.esi.msenseignement.entities;

import com.esi.msenseignement.model.Examen;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModule;
    private String nom;
    private int coeiff;
    private Long idExamen;
    @ManyToOne
    private Enseignant enseignant;
    @OneToMany(mappedBy = "module")
    private Collection<Seance> seance;



    @Transient
    private Examen examen;


}
