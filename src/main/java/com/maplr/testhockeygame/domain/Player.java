package com.maplr.testhockeygame.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "position")
    private String position;

    @Column(name = "captain")
    private boolean captain;

    @Column(name = "team_id")
    private Long teamId;

    @ManyToOne()
    @JoinColumn(name = "team_id", referencedColumnName = "id", updatable = false, insertable = false)
    private Team team;

}
