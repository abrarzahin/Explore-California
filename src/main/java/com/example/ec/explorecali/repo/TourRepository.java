package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.Difficulty;
import com.example.ec.explorecali.domain.Region;
import com.example.ec.explorecali.domain.Tour;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;


/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends CrudRepository<Tour,Integer> {
    List<Tour> findByTourPackageCode(String code);
}
