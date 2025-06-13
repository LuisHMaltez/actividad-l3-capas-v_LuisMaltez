package org.ncapas.videojuegos.controller;

import java.util.List;
import org.ncapas.videojuegos.dto.request.CreateVideoGame;
import org.ncapas.videojuegos.entity.Videojuego;
import org.ncapas.videojuegos.service.VideogameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/videogames")
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

    @GetMapping
    public ResponseEntity<List<Videojuego>> findAll() {
        List<Videojuego> videojuegos = videogameService.findAll();
        return ResponseEntity.ok(videojuegos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Videojuego> findById(@PathVariable Long id) {
        Videojuego videojuego = videogameService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(videojuego);
    }
}
