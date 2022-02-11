package com.maplr.testhockeygame.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto {
    private int number;
    private String name;
    private String lastname;
    private String position;
    private boolean captain;

}
