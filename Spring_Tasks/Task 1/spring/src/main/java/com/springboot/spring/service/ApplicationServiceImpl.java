package com.springboot.spring.service;

import com.springboot.spring.dao.ApplicationDAO;
import com.springboot.spring.model.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private ApplicationDAO applicationDAO;

    @Autowired
    public ApplicationServiceImpl(ApplicationDAO applicationDAO) {

        this.applicationDAO = applicationDAO;
    }

    @Override
    public List<Applications> findAll() {
        return applicationDAO.findAll();
    }
}
