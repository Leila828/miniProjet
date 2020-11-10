package com.esi.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HystrixController {

    @GetMapping("defaultBourse")
    public String messageBourse()
    {
        return "le service bourse n'est plus disponible";
    }

    @GetMapping("defaultExamen")
    public String messageExam()
    {
        return "le service Examen n'est plus disponible";
    }

    @GetMapping("defaultInscription")
    public String Inscription()
    {
        return "le service inscription n'est plus disponible";
    }
    @GetMapping("defaultEnseignement")
    public String messageEnseignement()
    {
        return "le service Enseignement n'est plus disponible";
    }
}
