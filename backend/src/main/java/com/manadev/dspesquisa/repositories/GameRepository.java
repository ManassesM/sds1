package com.manadev.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manadev.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Integer> {

}
