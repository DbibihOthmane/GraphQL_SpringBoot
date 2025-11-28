package com.example.graphql_springboot.dto;

import com.example.graphql_springboot.enums.TypeTransaction;

import java.util.Date;

public record TransactionRequest(
        Long compteId,
        double montant,
        Date date,
        TypeTransaction type
) {
}
