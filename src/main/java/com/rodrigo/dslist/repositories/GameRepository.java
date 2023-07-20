package com.rodrigo.dslist.repositories;

import com.rodrigo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
