package com.maplr.testhockeygame.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDto {
    private int id;
    private String coach;
    private Long year;
    private List<PlayerDto> players;
}
