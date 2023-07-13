package com.mcoder.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcoder.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
