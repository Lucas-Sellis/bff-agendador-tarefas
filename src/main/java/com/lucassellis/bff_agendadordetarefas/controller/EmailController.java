package com.lucassellis.bff_agendadordetarefas.controller;


import com.lucassellis.bff_agendadordetarefas.business.EmailService;
import com.lucassellis.bff_agendadordetarefas.business.dto.out.TarefasDTOResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")

public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTOResponse dto){
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }

}
