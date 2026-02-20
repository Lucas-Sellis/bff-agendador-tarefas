package com.lucassellis.bff_agendadordetarefas.infrastructure.Security;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SecurityScheme(
        name = SecurityConfig.SECURITY_SCHEME,
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class SecurityConfig {

    public static final String SECURITY_SCHEME = "bearerAuth";

    // Construtor privado para esconder o construtor público implícito
    private SecurityConfig() {
        throw new UnsupportedOperationException("Esta é uma classe de configuração e não deve ser instanciada.");
    }
}