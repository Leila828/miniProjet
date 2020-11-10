package com.esi.mscommandbourse.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.EntityId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
@Entity @Data @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Virement {
    @Id
    @EntityId
    @EqualsAndHashCode.Include
    private Long idVirement;
    private Float montant;

    private Date dateVirement;
    @ManyToOne
    private Etudiant etudiant;

}
