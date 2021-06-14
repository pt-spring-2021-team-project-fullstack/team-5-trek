package com.jackr.trek.jackrtrekproject.Repositorys;

import com.jackr.trek.jackrtrekproject.Models.Region;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, Long> {

    Region findById(long id);

    Optional<Region> findByNameOfRegion(String nameOfRegion);



}