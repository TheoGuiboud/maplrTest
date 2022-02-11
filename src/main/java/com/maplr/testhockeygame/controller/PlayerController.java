package com.maplr.testhockeygame.controller;

import com.maplr.testhockeygame.models.PlayerDto;
import com.maplr.testhockeygame.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/player")
@AllArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @PutMapping("/captain/{id}")
    public ResponseEntity<PlayerDto> editPlayer(@PathVariable("id") Long id) {
        PlayerDto response = playerService.editPlayer(id);
        return ResponseEntity.ok(response);
    }
}
