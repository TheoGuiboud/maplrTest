package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.domain.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
