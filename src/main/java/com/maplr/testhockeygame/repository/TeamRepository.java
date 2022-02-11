package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {
    Optional<Team> findByYear(@Param("year") Long year);
}
