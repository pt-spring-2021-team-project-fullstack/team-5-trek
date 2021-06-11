package com.jackr.trek.jackrtrekproject;

import org.springframework.data.repository.CrudRepository;

public interface ContinentRepository extends CrudRepository<Continent, Long> {

    Continent findByContinent(String Continent);

}
