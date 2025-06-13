package org.ncapas.videojuegos.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateVideoGame {
    private String name;
    private String genre;
    private int releaseYear;
    private String developer;
}

