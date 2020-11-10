package com.esi.msquerybourse.Entities;

import com.esi.coreapi.event.EtudiantAddedEvent;
import com.esi.coreapi.event.VirementAddEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VirementProjection {
    @Autowired
    VirementViewRepository virementViewRepository;

    @EventHandler
    public void on(VirementAddEvent event)
    {
        virementViewRepository.save(new VirementView(event.getIdVirement(),event.getMontant(),event.getNCompteCCP()));
    }



}
