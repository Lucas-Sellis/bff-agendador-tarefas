package com.lucassellis.bff_agendadordetarefas.business;


import com.lucassellis.bff_agendadordetarefas.business.dto.out.TarefasDTOResponse;
import com.lucassellis.bff_agendadordetarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class EmailService {

    private final EmailClient emailClientClient;


    public void enviaEmail ( TarefasDTOResponse dto){
         emailClientClient.enviarEmail(dto);
    }



}
