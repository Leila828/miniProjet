package com.esi.demo.proxy;

import com.esi.demo.model.EtudiantVirement;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="ms-bourse", fallback = BourseFallBack.class )
@RibbonClient(name = "ms-bourse")
public interface BourseProxy {
    @GetMapping("/virements/search/findVirementByEtudiant_IdEtudiant")
    public CollectionModel<EtudiantVirement> getVirements(@RequestParam("ide") Long ide);}