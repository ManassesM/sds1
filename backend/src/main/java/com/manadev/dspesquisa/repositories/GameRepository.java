package com.manadev.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manadev.dspesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}
