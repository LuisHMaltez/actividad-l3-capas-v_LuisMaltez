package org.ncapas.videojuegos.controller;

import org.ncapas.videojuegos.dto.request.CreateVideoGame;
import org.ncapas.videojuegos.entity.Videojuego;
import org.ncapas.videojuegos.service.VideogameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/videojuegos")
public class VideogameController {

    private final VideogameService videogameService;

    public VideogameController(VideogameService videogameService) {
        this.videogameService = videogameService;
    }

    @PostMapping
    public ResponseEntity<Videojuego> save(@RequestBody CreateVideoGame createVideoGame) {
        Videojuego videojuego = new Videojuego();
        videojuego.setNombre(createVideoGame.getNombre());
        videojuego.setGenero(createVideoGame.getGenero());
        videojuego.setAnioLanzamiento(createVideoGame.getAnioLanzamiento());
        videojuego.setDesarrollador(createVideoGame.getDesarrollador());
        videojuego = videogameService.save(videojuego);
        return ResponseEntity.status(HttpStatus.CREATED).body(videojuego);
    }
}
