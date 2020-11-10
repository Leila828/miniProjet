package com.esi.coreapi.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddVirementCommand {
    @TargetAggregateIdentifier
    private String idEtudiant;
    private Long   idVirement;
    private Float   montant;
    private Date dateVirement;
}
