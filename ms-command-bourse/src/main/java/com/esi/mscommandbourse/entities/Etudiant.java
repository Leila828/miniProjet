package com.esi.mscommandbourse.entities;

import com.esi.coreapi.command.AddEtudiantCommand;
import com.esi.coreapi.command.AddVirementCommand;
import com.esi.coreapi.event.EtudiantAddedEvent;
import com.esi.coreapi.event.VirementAddEvent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.AggregateMember;
import org.axonframework.modelling.command.EntityId;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Aggregate
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor

public class Etudiant {

    @AggregateIdentifier
   @Id
    private String idEtudiant;
    private String nCompteCCP;
    private Float salaireParant;
    private Boolean situationImpot;
    @AggregateMember
    @JsonIgnore
    @OneToMany(mappedBy = "etudiant",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    List<Virement> virements;

    @CommandHandler
    public Etudiant(AddEtudiantCommand cmd)
    {
        Assert.notNull(cmd.getIdEtudiant(), "id should be not null");
        Assert.notNull(cmd.getNCompteCCP(), "nCompte should be not null");
        this.idEtudiant=cmd.getIdEtudiant();
        this.nCompteCCP=cmd.getNCompteCCP();
        this.salaireParant=cmd.getSalaireParant();
        this.situationImpot=cmd.getSituationImpot();
        this.virements=  new ArrayList<>();

        AggregateLifecycle.apply(new EtudiantAddedEvent( cmd.getIdEtudiant(),
                cmd.getSituationImpot(),cmd.getNCompteCCP(),cmd.getSalaireParant()));

    }

    @CommandHandler
    public void handle(AddVirementCommand cmd)
    {
        Assert.notNull(cmd.getIdVirement(), "id should be not null");
        Assert.notNull(cmd.getMontant(), "montant should be not null");

        this.virements.add(new Virement(
                cmd.getIdVirement(),cmd.getMontant(),cmd.getDateVirement(),
                this
        ));

        AggregateLifecycle.apply(new VirementAddEvent(
                this.nCompteCCP,
                cmd.getIdVirement(),
                cmd.getMontant()));


    }


}
