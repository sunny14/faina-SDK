package faina.sdk.rest;

import faina.sdk.entity.Movie;
import faina.sdk.repository.MovieRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieRepo repo;

    public MovieController(MovieRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/movie")
    Movies all() {
        return new Movies(repo.findAll());
    }
}

class Movies  {
    private List<Movie> docs;

    public Movies() {
    }

    public Movies(List<Movie> docs) {
        this.docs = docs;
    }

    public List<Movie> getDocs() {
        return docs;
    }
}
