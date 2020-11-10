package com.esi.coreapi.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class EtudiantAddedEvent {
  @TargetAggregateIdentifier
  private String idEtudiant;
  private Boolean situationImpot;
  private String nCompteCCP;
  private Float salaireParant;


  }
