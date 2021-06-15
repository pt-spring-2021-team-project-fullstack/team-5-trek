package com.jackr.trek.jackrtrekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ContinentRepository extends CrudRepository<Continent, Long> {

//    Continent findByContinent(String Continent);

    Continent findById(long Id);

    Continent findContinentByName(String name);

}
