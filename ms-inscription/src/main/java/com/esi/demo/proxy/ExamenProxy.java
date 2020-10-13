package com.esi.demo.proxy;

import com.esi.demo.model.EtudiantExamen;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-examen", url = "localhost:8082")
public interface ExamenProxy {

    @GetMapping("/etudiants/{id}")
    EtudiantExamen getEtudiantExamen(@PathVariable("id") Long id,
                                        @RequestParam("projection") String projection);
}
