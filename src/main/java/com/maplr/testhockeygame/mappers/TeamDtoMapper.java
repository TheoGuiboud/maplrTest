package com.maplr.testhockeygame.mappers;

import com.maplr.testhockeygame.domain.Team;
import com.maplr.testhockeygame.models.TeamDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TeamDtoMapper {

    public abstract TeamDto toDto(Team team);
}
