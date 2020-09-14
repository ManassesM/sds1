package com.manadev.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manadev.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Integer> {

}
