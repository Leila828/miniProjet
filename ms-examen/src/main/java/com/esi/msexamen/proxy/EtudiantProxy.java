package com.esi.msexamen.proxy;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ms-inscreption", url="localhost:8081" )
public interface EtudiantProxy {
}
