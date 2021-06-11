package com.jackr.trek.jackrtrekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek, Long> {

    Optional<Trek> findByType(String trekType);
}