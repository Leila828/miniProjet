package com.esi.coreapi.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VirementAddEvent {
    private String nCompteCCP;
    private Long idVirement;
    private Float montant;

}
