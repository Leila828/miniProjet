package com.esi.msexamen.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNote;
    private int note;
     @OneToOne
    private Examen examen;
     @ManyToOne
    private  Etudiant etudiant;
}
