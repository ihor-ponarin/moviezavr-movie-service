package ua.pon.moviezavr.service.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "MOVIE", schema = "moviezavr")
@Data
public class MovieEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
    private Long id;

    @Column
    private String producer;

    @Column
    private String name;

    @Column
    private String description;
}
