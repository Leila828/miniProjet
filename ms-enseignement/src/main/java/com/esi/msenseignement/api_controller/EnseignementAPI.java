package com.esi.msenseignement.api_controller;

import com.esi.msenseignement.dao.EnseignantRepository;
import com.esi.msenseignement.dao.ModuleRepository;
import com.esi.msenseignement.entities.Module;
import com.esi.msenseignement.model.Examen;
import com.esi.msenseignement.proxy.ExamenProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EnseignementAPI {
@Autowired
    EnseignantRepository enseignantRepository;
@Autowired
    ExamenProxy examenProxy;
@Autowired
    ModuleRepository moduleRepository;
@GetMapping("module/{id}")
public Module getModuleWithExamen(@PathVariable("id") Long idModule){

    Module module=moduleRepository.findById(idModule).get();
    Examen examen= examenProxy.getExamen(module.getIdExamen());
    module.setExamen(examen);
    return module;
}

}
