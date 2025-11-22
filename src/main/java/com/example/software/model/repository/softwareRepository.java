package com.example.software.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.software.model.entity.software;

public interface softwareRepository extends JpaRepository<software, Long> {
    boolean existsByNome(String nome);
}
