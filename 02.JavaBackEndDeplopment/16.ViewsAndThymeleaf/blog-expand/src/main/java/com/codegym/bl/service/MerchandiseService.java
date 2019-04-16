package com.codegym.bl.service;

import com.codegym.bl.model.Merchandise;

public interface MerchandiseService {
    Iterable<Merchandise> findAll();
    void save(Merchandise merchandise);

    Merchandise findById(Long id);

    void remove(Long id);
}
