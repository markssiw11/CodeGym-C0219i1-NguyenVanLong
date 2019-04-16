package com.codegym.bl.service.impl;

import com.codegym.bl.model.Merchandise;
import com.codegym.bl.repository.MerchandiseRepository;
import com.codegym.bl.service.MerchandiseService;
import org.springframework.beans.factory.annotation.Autowired;

public class MerchandiseServiceIpml implements MerchandiseService {
    @Autowired
    MerchandiseRepository merchandiseRepository;
    @Override
    public Iterable<Merchandise> findAll() {
        return merchandiseRepository.findAll();
    }

    @Override
    public void save(Merchandise merchandise) {
        merchandiseRepository.save(merchandise);
    }

    @Override
    public Merchandise findById(Long id) {
        return merchandiseRepository.findOne(id);
    }

    @Override
    public void remove(Long id) {
        merchandiseRepository.delete(id);
    }

}
