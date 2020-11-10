package com.esi.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    private Long idEtudiant;

    private Long nCompteCCP;
    private Float salaireParant;
    private Boolean situationImpot;

    @JsonIgnore
    @OneToMany(mappedBy = "etudiant")
    List<Virement> virements;

}
