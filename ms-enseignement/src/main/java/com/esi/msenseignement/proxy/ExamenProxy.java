package com.esi.msenseignement.proxy;

import com.esi.msenseignement.model.Examen;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-examen" , url = "localhost:8081")
public interface ExamenProxy {
@GetMapping("/Examen/{id}")
public Examen getExamen(@PathVariable("id") Long idExamen);
}
