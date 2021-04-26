package kz.attractorschool.moviereviewrr.repository;

import kz.attractorschool.moviereviewrr.model.User;
import org.apache.el.stream.Optional;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    List<User> findByEmailContaining(String emailPattern);
    @Query("{'name':?0}")
        // Query("select User u where u.name = ?0 ")
    List<User> getAllByFullName(String name);
}
