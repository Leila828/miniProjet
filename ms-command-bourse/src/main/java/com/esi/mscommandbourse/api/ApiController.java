package com.esi.mscommandbourse.api;

import com.esi.coreapi.command.AddEtudiantCommand;
import com.esi.coreapi.command.AddVirementCommand;
import com.esi.coreapi.dto.etudiantDTO;
import com.esi.coreapi.dto.virementDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("command")
public class ApiController {
    @Autowired
    CommandGateway commandGateway;
  @PostMapping("/etudiant")
    public String newEtudiant(@RequestBody etudiantDTO etudiantDTO)
    {

        commandGateway.send(new AddEtudiantCommand(
                etudiantDTO.getIdEtudiant(),
                etudiantDTO.getNCompteCCP(),

                etudiantDTO.getSalaireParant()  ,etudiantDTO.getSituationImpot()));

        return "created";
    }
    @PostMapping("/etudiant/{ide}/virement")
    public String addVirement(@PathVariable String  ide, @RequestBody virementDTO virementDTO)
    {
        commandGateway.send(new AddVirementCommand(
                ide,
                virementDTO.getIdVirement(),
                virementDTO.getMontant(),
                virementDTO.getDateVirement()
        ));

        return "Added";
    }


}
