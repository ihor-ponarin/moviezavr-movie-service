package ua.pon.moviezavr.service.movie.mapper;

import org.mapstruct.Mapper;
import ua.pon.moviezavr.service.movie.dto.MovieDto;
import ua.pon.moviezavr.service.movie.entity.MovieEntity;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    MovieDto movieEntity2MovieDto(MovieEntity movieEntity);
}
