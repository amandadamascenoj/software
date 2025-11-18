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

    <<<<<<<HEAD

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrlDownload() {
        return urlDownload;
    }

    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    =======>>>>>>>81bbb81 (alteração na pasta model)
}
