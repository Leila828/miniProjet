package com.esi.demo.proxy;

import com.esi.demo.model.EtudiantVirement;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;

@Component
public class BourseFallBack {

    public String getMsg() {
        return "circuit breaker";
    }
}
