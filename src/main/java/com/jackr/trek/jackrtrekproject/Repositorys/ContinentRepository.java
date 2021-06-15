package com.jackr.trek.jackrtrekproject.Repositorys;

import com.jackr.trek.jackrtrekproject.Models.Continent;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ContinentRepository extends CrudRepository<Continent, Long> {

    Continent findById(long Id);

    Optional<Continent> findByName(String name);

}