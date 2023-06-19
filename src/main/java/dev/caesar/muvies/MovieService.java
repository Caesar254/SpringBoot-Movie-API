package dev.caesar.muvies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired // Java instantiates this instead of using a constructor
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {

        return movieRepository.findAll();

    }
//
//    public Optional<Movie> singleMovie(ObjectId id) {
//        return movieRepository.findById(id);
//    }


    // get by imdbId for security.The id should not be seen in the url

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
