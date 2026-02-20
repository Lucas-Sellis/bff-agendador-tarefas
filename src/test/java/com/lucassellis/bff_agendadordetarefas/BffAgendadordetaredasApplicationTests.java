package com.lucassellis.bff_agendadordetarefas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BffAgendadordetarefasApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        // Verifica se o contexto do Spring foi carregado corretamente
        Assertions.assertNotNull(applicationContext, "O contexto do Spring não deve ser nulo");
    }

}