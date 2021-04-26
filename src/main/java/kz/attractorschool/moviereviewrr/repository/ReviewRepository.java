package kz.attractorschool.moviereviewrr.repository;

import kz.attractorschool.moviereviewrr.model.Movie;
import kz.attractorschool.moviereviewrr.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, String> {
//    List<Review> findByTitle(String title);
//    List<Review> findByTitleContains(String partTitle);
//    List<Review> findByReleaseYear(Integer year);
//    List<Review> findByActorsIn(List<String> actors);
//    Page<Review> findAll (Pageable pageable);

}
