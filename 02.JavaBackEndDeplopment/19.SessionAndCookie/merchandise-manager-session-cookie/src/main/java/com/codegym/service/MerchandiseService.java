package com.codegym.service;

import com.codegym.model.Merchandise;

import java.util.List;

public interface MerchandiseService {
    List<Merchandise> findAll();

    void save(Merchandise merchandise);

    Merchandise findById(int id);

    void remove(int id);

    void update(int id, Merchandise merchandise);
}
