package com.esi.coreapi.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class AddEtudiantCommand {

    @TargetAggregateIdentifier
    private String idEtudiant;
    private String nCompteCCP;
    private Float salaireParant;
    private Boolean situationImpot;

}
