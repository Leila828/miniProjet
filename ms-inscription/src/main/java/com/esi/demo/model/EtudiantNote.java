package com.esi.demo.model;

import lombok.Data;

import javax.persistence.OneToOne;
@Data
public class EtudiantNote {
    private Long idNote;
    private int note;
}
