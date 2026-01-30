package com.lucassellis.bff_agendadordetarefas.business.dto.out;


import lombok.*;

@Builder


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TelefoneDTOResponse {

    private Long id;
    private String numero;
    private String ddd;


}
