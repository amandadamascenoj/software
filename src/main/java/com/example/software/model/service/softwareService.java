package com.example.software.model.service;

import com.example.software.dto.softwareDTO;
import com.example.software.model.entity.software;
import com.example.software.model.repository.softwareRepository;
import com.example.software.model.validation.softwareValidation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class softwareService {

    softwareRepository softwareRepository;
    softwareValidation softwareValidation;

    public softwareService(softwareRepository softwareRepository, softwareValidation softwareValidation) {
        this.softwareRepository = softwareRepository;
        this.softwareValidation = softwareValidation;
    }

    public software create(softwareDTO dto) {
        return softwareRepository.save(new software(dto));
    }

    public software update(softwareDTO dto, Long id) {
        software software = findById(id);

        software.setNome(dto.nome());
        software.setDescricao(dto.descricao());
        software.setCategoria(dto.categoria());
        software.setTipo(dto.tipo());
        software.setUrlDownload(dto.urlDownload());
        software.setVersao(dto.versao());

        return (softwareRepository.save(software));
    }

    public void delete(Long id) {
        softwareRepository.deleteById(id);
    }

    public software findById(long id) {
        return softwareRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Software não encontrado com o id: " + id));
    }

    public List<software> findAll() {
        return softwareRepository.findAll();
    }
}
