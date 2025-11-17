package com.example.software.dto;

public record softwareDTO(
        Long id,
        String versao,
        String nome,
        String descricao,
        String urlDownload,
        String tipo,
        String categoria) {
}
