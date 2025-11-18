package com.example.software.model.validation;

import com.example.software.dto.softwareDTO;
import org.springframework.context.annotation.Configuration;

@Configuration
public class softwareValidation {
    public boolean exisId(softwareDTO dto) {
        return dto.id() != null;
    }
}
