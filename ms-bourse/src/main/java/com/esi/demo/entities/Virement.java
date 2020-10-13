package com.esi.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Virement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idVirement;
    private Float montant;

    private Date dateVirement;
    @ManyToOne
    private Etudiant etudiant;
}
