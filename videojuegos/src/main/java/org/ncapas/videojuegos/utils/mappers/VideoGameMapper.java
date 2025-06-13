package org.ncapas.videojuegos.utils.mappers;

import org.ncapas.videojuegos.dto.response.VideoGameResponse;
import org.ncapas.videojuegos.entity.Videojuego;

import java.util.List;
import java.util.stream.Collectors;

public class VideoGameMapper {
    public static VideoGameResponse toDto(Videojuego videojuego) {
        return VideoGameResponse.builder()
                .id(videojuego.getId())
                .nombre(videojuego.getNombre())
                .genero(videojuego.getGenero())
                .anioLanzamiento(videojuego.getAnioLanzamiento())
                .desarrollador(videojuego.getDesarrollador())
                .build();
    }

    public static List<VideoGameResponse> toDto(List<Videojuego> videojuegos) {
        return videojuegos.stream()
                .map(VideoGameMapper::toDto)
                .collect(Collectors.toList());
    }

    public static Videojuego toEntity(VideoGameResponse videoGameResponse) {
        return Videojuego.builder()
                .nombre(videoGameResponse.getNombre())
                .genero(videoGameResponse.getGenero())
                .anioLanzamiento(videoGameResponse.getAnioLanzamiento())
                .desarrollador(videoGameResponse.getDesarrollador())
                .build();
    }
}
