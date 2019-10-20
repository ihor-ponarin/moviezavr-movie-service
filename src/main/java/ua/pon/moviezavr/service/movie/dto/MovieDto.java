package ua.pon.moviezavr.service.movie.dto;

import lombok.Data;

@Data
public class MovieDto {
    private Long id;
    private String producer;
    private String name;
    private String description;
}
