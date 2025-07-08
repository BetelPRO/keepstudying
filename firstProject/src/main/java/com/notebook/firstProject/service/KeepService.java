package com.notebook.firstProject.service;

import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.notebook.firstProject.entity.Keep;
import com.notebook.firstProject.repository.KeepRepository;

@Service
public class KeepService {
    private KeepRepository keepRepository;

    public KeepService(KeepRepository keepRepository) {
        this.keepRepository = keepRepository;
    }

    public List<Keep> create(Keep keep) {
        keepRepository.save(keep);
        return list();
    }

    public List<Keep> list() {
        Sort sort = Sort.by(Direction.DESC, "prioridade")
                .and(Sort.by(Direction.ASC, "nome"));
        return keepRepository.findAll(sort);
    }

    public List<Keep> update(Keep keep) {
        keepRepository.save(keep);
        return list();

    }

    public List<Keep> delete(Long id) {
        keepRepository.delete(null);
        return list();
    }
}
