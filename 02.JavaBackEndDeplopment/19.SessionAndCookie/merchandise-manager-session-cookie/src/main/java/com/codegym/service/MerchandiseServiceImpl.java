package com.codegym.service;

import com.codegym.model.Merchandise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MerchandiseServiceImpl implements MerchandiseService {
    private static Map<Integer,Merchandise> merchandises;
    static{
        merchandises= new HashMap<>();
        merchandises.put(1,new Merchandise(1,"hoa hong","20.000vnd","giao hang mien phi"));
        merchandises.put(2,new Merchandise(2,"hoa mai","10.000vnd","giao hang mien phi"));
        merchandises.put(3,new Merchandise(3,"hoa lan","25.000vnd","giao hang mien phi"));
        merchandises.put(4,new Merchandise(4,"hoa cuc","30.000vnd","giao hang mien phi"));
        merchandises.put(5,new Merchandise(5,"hoa truc","40.000vnd","giao hang mien phi"));
    }
    @Override
    public List<Merchandise> findAll() {
        return new ArrayList<>(merchandises.values());
    }

    @Override
    public void save(Merchandise merchandise) {
        merchandises.put(merchandise.getId(),merchandise);
    }

    @Override
    public Merchandise findById(int id) {
        return merchandises.get(id);
    }

    @Override
    public void remove(int id) {
        merchandises.remove(id);
    }

    @Override
    public void update(int id, Merchandise merchandise) {
        merchandises.put(id,merchandise);
    }
}
