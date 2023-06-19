package dev.caesar.muvies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection="movies") // this class presents documents in the movies collection in the database
@Data // takes care of setters and getters
@AllArgsConstructor  //takes cares of constructors with arguments
@NoArgsConstructor  //takes cares of constructors with no arguments
public class Movie {
        @Id
        private ObjectId id;
        private String imdbId;
        private String title;
        private String releaseDate;
        private String trailerLink;
        private String poster;
        private List<String> backdrops;
        private List<String> genres;
        @DocumentReference // this will cause the database to store only the id sof the reviews
        private List<Review> reviews;
}
