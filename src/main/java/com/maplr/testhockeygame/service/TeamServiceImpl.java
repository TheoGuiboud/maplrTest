package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.domain.Team;
import com.maplr.testhockeygame.mappers.TeamDtoMapper;
import com.maplr.testhockeygame.models.TeamDto;
import com.maplr.testhockeygame.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{

    private final TeamRepository teamRepository;

    private final TeamDtoMapper teamDtoMapper;


    @Override
    public TeamDto getTeam(Long year) {
        Team team = teamRepository.findByYear(year).orElseThrow(EntityNotFoundException::new);
        return teamDtoMapper.toDto(team);
    }
}
