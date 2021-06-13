package com.jackr.trek.jackrtrekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekTypeRepository extends CrudRepository<TrekType, Long> {

    //Optional<TrekType> findByTrekTypePerContinent(String trekTypePerContinent);

}