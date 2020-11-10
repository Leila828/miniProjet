package com.esi.demo.proxy;

import com.esi.demo.model.EtudiantNote;
import com.esi.demo.model.EtudiantVirement;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ms-examen", fallback = ExamenFallBack.class)
@RibbonClient(name = "ms-examen")

public interface ExamenProxy {
    @GetMapping("/notes/search/findNotesByEtudiant_IdEtudiant")
    public CollectionModel<EtudiantNote> getNotes(@RequestParam("ide") Long ide);}
