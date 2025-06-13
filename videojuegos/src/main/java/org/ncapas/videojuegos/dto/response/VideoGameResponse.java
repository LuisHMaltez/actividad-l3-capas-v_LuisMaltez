package org.ncapas.videojuegos.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoGameResponse {
    private Long id;
    private String name;
    private String genre;
    private int releaseYear;
    private String developer;
}

