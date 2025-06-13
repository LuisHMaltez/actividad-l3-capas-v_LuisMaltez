package org.ncapas.videojuegos.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateVideoGame {
    private String nombre;
    private String genero;
    private int anioLanzamiento;
    private String desarrollador;
}

