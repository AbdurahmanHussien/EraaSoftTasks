package com.springboot.spring.dao;

import com.springboot.spring.model.Applications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDAO extends JpaRepository<Applications, Long> {
}
