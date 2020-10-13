package com.esi.msexamen.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ms-enseignement", url="localhost:8080" )
public interface EnseignmentProxy {
}
