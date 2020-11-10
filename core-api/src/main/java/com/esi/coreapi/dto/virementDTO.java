package com.esi.coreapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class virementDTO {
    private Long idVirement;
    private Float montant;
    private Date dateVirement;
}
