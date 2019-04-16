package com.codegym.bl.repository;

import com.codegym.bl.model.Merchandise;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MerchandiseRepository extends PagingAndSortingRepository<Merchandise,Long>{
}
