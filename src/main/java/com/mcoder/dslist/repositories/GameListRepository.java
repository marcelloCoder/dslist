package com.mcoder.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcoder.dslist.entities.Game;
import com.mcoder.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
