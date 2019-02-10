package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.Tour;
import com.example.ec.explorecali.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

/**
 * Tour Package Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    TourPackage findByName(String name);
}

