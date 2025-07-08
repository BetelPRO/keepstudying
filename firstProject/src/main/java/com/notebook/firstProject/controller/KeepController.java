package com.notebook.firstProject.controller;

import com.notebook.firstProject.service.KeepService;
import org.springframework.web.bind.annotation.*;

import com.notebook.firstProject.entity.Keep;

import java.util.List;

@RestController
@RequestMapping("/keeps")
public class KeepController {
    private final KeepService keepService;

    public KeepController(KeepService keepService) {
        this.keepService = keepService;
    }

    @PostMapping
    List<Keep> create(@RequestBody Keep keep) {
        return keepService.create(keep);
    }

    @GetMapping
    List<Keep> list(){
        return keepService.list();
    }

    @PutMapping
    List<Keep> update(@RequestBody Keep keep) {
        return keepService.update(keep);
    }

    @DeleteMapping("{id}")
    List<Keep> delete(Long id) {
        return keepService.delete(id);
    }
}
