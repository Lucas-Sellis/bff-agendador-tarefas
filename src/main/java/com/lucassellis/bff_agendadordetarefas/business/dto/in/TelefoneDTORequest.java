package com.lucassellis.bff_agendadordetarefas.business.dto.in;


import lombok.*;

@Builder


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TelefoneDTORequest {

    private String numero;
    private String ddd;


}
