package com.maplr.testhockeygame.mappers;

import com.maplr.testhockeygame.domain.Player;
import com.maplr.testhockeygame.models.PlayerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class PlayerDtoMapper {

    @Mapping(target = "team", ignore = true)
    public abstract Player toEntity(PlayerDto dto);

    public abstract PlayerDto toDto(Player player);
}
