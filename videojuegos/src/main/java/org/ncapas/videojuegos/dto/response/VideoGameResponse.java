package org.ncapas.videojuegos.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoGameResponse {
    private Long id;
    private String nombre;
    private String genero;
    private int anioLanzamiento;
    private String desarrollador;
}

