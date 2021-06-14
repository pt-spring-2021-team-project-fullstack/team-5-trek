package com.jackr.trek.jackrtrekproject.Repositorys;

import com.jackr.trek.jackrtrekproject.Models.Trek;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek, Long> {

    Trek findById(long id);

    Optional<Trek> findByTrekName(String trekName);
}