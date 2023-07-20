package com.rodrigo.dslist.services;

import com.rodrigo.dslist.entities.Game;
import com.rodrigo.dslist.entities.dto.GameDTO;
import com.rodrigo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }
}
