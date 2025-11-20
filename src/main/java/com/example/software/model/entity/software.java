package com.example.software.model.entity;

import com.example.software.dto.softwareDTO;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class software {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    private String versao;

    @Nonnull
    private String nome;

    @Nonnull
    private String descricao;

    @Nonnull
    private String urlDownload;

    @Nonnull
    private String tipo;

    @Nonnull
    private String categoria;

    public software() {
    }

    public software(softwareDTO dto) {
        this.id = dto.id();
        this.versao = dto.versao();
        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.urlDownload = dto.urlDownload();
        this.tipo = dto.tipo();
        this.categoria = dto.categoria();
    }
}
