package ua.pon.moviezavr.service.movie.repo;

import org.springframework.data.repository.CrudRepository;
import ua.pon.moviezavr.service.movie.entity.MovieEntity;

public interface MovieRepository extends CrudRepository<MovieEntity, Long> {
}
