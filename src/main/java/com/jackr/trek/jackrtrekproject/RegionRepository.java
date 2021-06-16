package com.jackr.trek.jackrtrekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, Long> {

    Optional<Region> findByRegionName(String regionName);

//    Optional<Region> findByRegion(String region);

//    Region findById(long id);


}