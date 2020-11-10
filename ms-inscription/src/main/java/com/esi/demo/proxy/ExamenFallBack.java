package com.esi.demo.proxy;

import com.esi.demo.model.EtudiantNote;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;

@Component
public class ExamenFallBack {

    public String getMsg() {
        return "circuit breaker";
    }
}
