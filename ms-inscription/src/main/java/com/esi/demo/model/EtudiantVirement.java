package com.esi.demo.model;

import com.esi.demo.entities.Etudiant;
import lombok.Data;

import java.util.Date;
@Data
public class EtudiantVirement {
    private Long idVirement;
    private Float montant;

    private Date dateVirement;

}
