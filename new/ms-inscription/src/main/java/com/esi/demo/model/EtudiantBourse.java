package com.esi.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantBourse {

    private Long idEtudiant;

    private long nCompteCCP;
    private float salaireParant;
    private boolean situationImpot;
    List<EtudiantVirement> virements;

}
