package com.lucassellis.bff_agendadordetarefas.business.dto.in;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioDTORequest {




    // nome que chega da requisição (Postman, Front, etc)
    private String nome;

    // email que o usuário vai usar para login
    private String email;

    // senha normal (texto puro) — depois eu vou criptografar no service
    private String senha;

    // lista de endereços enviados na entrada (cada endereço também é um DTO)
    private List<EnderecoDTORequest> enderecos;

    // lista de telefones enviados na entrada (também DTO)
    private List<TelefoneDTORequest> telefones;
}


