package com.anadunning.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anadunning.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
