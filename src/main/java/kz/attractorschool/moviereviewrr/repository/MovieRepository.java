package kz.attractorschool.moviereviewrr.repository;

import kz.attractorschool.moviereviewrr.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
    List<Movie> findByTitle(String title);
    List<Movie> findByTitleContains(String partTitle);
    List<Movie> findByReleaseYear(Integer year);
    List<Movie> findByActorsIn(List<String> actors);

}
