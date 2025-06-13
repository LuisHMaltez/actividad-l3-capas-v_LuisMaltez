package org.ncapas.videojuegos.service;

import org.ncapas.videojuegos.entity.Videojuego;
import org.ncapas.videojuegos.repository.iVideojuegoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideogameService {

    private final iVideojuegoRepository videojuegoRepository;

    public VideogameService(iVideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public Videojuego save(Videojuego videojuego) {
        return videojuegoRepository.save(videojuego);
    }
    
    }   
