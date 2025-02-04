package com.sesi.projeto.dto;

import java.time.Instant;

import org.springframework.stereotype.Component;

import com.sesi.projeto.entities.StatusDoPedido;

@Component
public record PedidoDto(Instant momento, StatusDoPedido status) {

    public PedidoDto() {
        this(Instant.now(), null);  // Defina um valor padrão para momento
    }
}
