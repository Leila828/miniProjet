package com.esi.msenseignement.proxy;

import com.esi.msenseignement.model.Examen;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-examen")
@RibbonClient(name = "ms-examen")

public interface ExamenProxy {
@GetMapping("/examens/{id}")
public Examen getExamen(@PathVariable("id") Long idExamen);
}
