package com.jackr.trek.jackrtrekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, Long> {

    Optional<Region> findById(long id);



}