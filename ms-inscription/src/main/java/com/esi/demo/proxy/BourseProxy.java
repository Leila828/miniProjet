package com.esi.demo.proxy;

import com.esi.demo.model.EtudiantBourse;
import com.esi.demo.model.EtudiantExamen;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-bourse", url = "localhost:8083")
public interface BourseProxy {
    @GetMapping("/etudiants/{id}")
    EtudiantBourse getEtudiantBourse(@PathVariable("id") Long id,
                                     @RequestParam("projection") String projection);
}
