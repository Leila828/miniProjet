package com.esi.msquerybourse.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class VirementView {
@Id
    private Long idVirement;
    private Float montant;
    private String nCompteCCP;
}
