package ua.pon.moviezavr.service.movie.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pon.moviezavr.service.movie.dto.MovieDto;
import ua.pon.moviezavr.service.movie.mapper.MovieMapper;
import ua.pon.moviezavr.service.movie.repo.MovieRepository;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@RestController
@RequestMapping("/movies")
@Api(value = "movies")
public class MovieController {
    private MovieMapper movieMapper;
    private MovieRepository movieRepository;

    public MovieController(MovieMapper movieMapper, MovieRepository movieRepository) {
        this.movieMapper = movieMapper;
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    @ApiOperation("Get all movies")
    private List<MovieDto> findAll() {
        return stream(movieRepository.findAll().spliterator(), false)
                .map(movieMapper::movieEntity2MovieDto)
                .collect(toList());
    }
}
