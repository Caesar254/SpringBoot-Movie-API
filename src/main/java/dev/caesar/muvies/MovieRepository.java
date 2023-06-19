package dev.caesar.muvies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Repository does the job of 'talking to the database and getting the datapack'

@Repository  // so that the application know that this is a repository. Repository manages data
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);

}
