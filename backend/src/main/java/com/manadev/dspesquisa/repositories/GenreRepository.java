package com.manadev.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manadev.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
