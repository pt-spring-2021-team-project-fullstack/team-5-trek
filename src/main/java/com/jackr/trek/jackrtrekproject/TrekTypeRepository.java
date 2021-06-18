package com.jackr.trek.jackrtrekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekTypeRepository extends CrudRepository<TrekType, Long> {

    TrekType findTrekTypeByDifficultyLevel(String difficultyLevel);

    TrekType findById(long id);

//    Optional<TrekType> findByContinents(String trekType);
}