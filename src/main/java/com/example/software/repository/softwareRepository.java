package com.example.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.software.model.software;

public interface softwareRepository extends JpaRepository<software, Long>{
    boolean existsByNome(String nome);
}
