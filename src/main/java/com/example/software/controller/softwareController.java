package com.example.software.controller;

import com.example.software.dto.softwareDTO;
import com.example.software.model.entity.software;
import com.example.software.model.repository.softwareRepository;
import com.example.software.model.service.softwareService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/software")
public class softwareController {

    private softwareService softwareService;

    public softwareController(softwareService softwareService) {
        this.softwareService = softwareService;
    }

    @PostMapping
    public software create(@RequestBody softwareDTO software) {
        return softwareService.create(software);
    }

    @GetMapping("/findAll")
    public List<software> findAll() {
        return softwareService.findAll();
    }

    @GetMapping("/{id}")
    public software findById(@PathVariable Long id) {
        return softwareService.findById(id);
    }

    @PutMapping("/{id}")
    public software update(@PathVariable Long id, @RequestBody softwareDTO software) {
        return softwareService.update(software, id);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        softwareService.delete(id);
    }

    @GetMapping("/exists/{id}")
    public boolean exists(@PathVariable Long id) {
        return softwareService.exists(id);
    }

}
