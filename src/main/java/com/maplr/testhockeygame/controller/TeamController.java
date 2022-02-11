package com.maplr.testhockeygame.controller;

import com.maplr.testhockeygame.models.PlayerDto;
import com.maplr.testhockeygame.models.TeamDto;
import com.maplr.testhockeygame.service.PlayerService;
import com.maplr.testhockeygame.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/team")
@AllArgsConstructor
public class TeamController {

    private TeamService teamService;
    private PlayerService playerService;

    @GetMapping("/{year}")
    public ResponseEntity<TeamDto> getOneTeam(@PathVariable("year") Long year) {
        TeamDto response = teamService.getTeam(year);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/{year}")
    public ResponseEntity<PlayerDto> createPlayer(@PathVariable("year") Long year, @RequestBody PlayerDto playerDto) throws Exception {
        PlayerDto response = playerService.createPlayer(year, playerDto);
        return ResponseEntity.ok(response);
    }
}
