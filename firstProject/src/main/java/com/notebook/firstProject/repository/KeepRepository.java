package com.notebook.firstProject.repository;

import com.notebook.firstProject.entity.Keep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeepRepository extends JpaRepository<Keep, Long> {

}
