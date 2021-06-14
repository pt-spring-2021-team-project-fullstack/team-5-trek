package com.jackr.trek.jackrtrekproject.Repositorys;

import com.jackr.trek.jackrtrekproject.Models.TrekType;
import org.springframework.data.repository.CrudRepository;

public interface TrekTypeRepository extends CrudRepository<TrekType, Long> {

    //Optional<TrekType> findByTrekTypePerContinent(String trekTypePerContinent);

}