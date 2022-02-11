package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.domain.Player;
import com.maplr.testhockeygame.domain.Team;
import com.maplr.testhockeygame.mappers.PlayerDtoMapper;
import com.maplr.testhockeygame.models.PlayerDto;
import com.maplr.testhockeygame.repository.PlayerRepository;
import com.maplr.testhockeygame.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;

    private final PlayerDtoMapper playerDtoMapper;

    @Override
    @Transactional
    public PlayerDto editPlayer(Long id) {
        Player player = playerRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        player.setCaptain(true);
        playerRepository.save(player);
        return playerDtoMapper.toDto(player);
    }

    @Override
    @Transactional
    public PlayerDto createPlayer(Long year, PlayerDto playerDto) throws Exception {
        Player player = playerDtoMapper.toEntity(playerDto);
        Optional<Team> team = teamRepository.findByYear(year);
        if (team.isPresent()) {
            player.setTeam(team.get());
            player.setTeamId(team.get().getId());
            playerRepository.save(player);
        }
        else {
            throw new Exception("Team doesn't exist");
        }

        return playerDto;
    }
}
