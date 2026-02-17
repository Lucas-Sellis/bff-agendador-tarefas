package com.lucassellis.bff_agendadordetarefas.business.dto.in;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//  git add .
//git commit -m "test: trigger CI"
//  git push origin develop

public class EnderecoDTORequest {


    private String rua;
    private Long numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;



}
