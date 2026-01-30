package com.lucassellis.bff_agendadordetarefas.business.dto.in;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginRequestDTO {

   private String email;
   private String senha;
}
