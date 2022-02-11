package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.models.PlayerDto;

public interface PlayerService {

    PlayerDto editPlayer(Long id);

    PlayerDto createPlayer(Long year, PlayerDto playerDto) throws Exception;
}
