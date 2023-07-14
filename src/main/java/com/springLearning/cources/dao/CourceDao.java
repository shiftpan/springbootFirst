package com.springLearning.cources.dao;

import com.springLearning.cources.entity.Cource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourceDao extends JpaRepository<Cource, Long> {
}
