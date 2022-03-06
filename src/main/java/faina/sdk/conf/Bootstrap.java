package faina.sdk.conf;

import faina.sdk.entity.Book;
import faina.sdk.entity.Chapter;
import faina.sdk.entity.Movie;
import faina.sdk.enums.Race;
import faina.sdk.repository.BookRepo;
import faina.sdk.repository.ChapterRepo;
import faina.sdk.repository.CharacterRepo;
import faina.sdk.repository.MovieRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bootstrap {

    private static final Logger log = LoggerFactory.getLogger(Bootstrap.class);

    @Bean
    CommandLineRunner initCharacters(CharacterRepo repository) {

        return args -> {
            log.info("******************************    Preloading characters...    ******************************");
            log.info(repository.save(new faina.sdk.entity.Character("Bilbo Baggins", Race.HOBBIT)).getName());
            log.info(repository.save(new faina.sdk.entity.Character("Frodo Baggins", Race.HOBBIT)).getName());
        };
    }

    @Bean
    CommandLineRunner initBooks(BookRepo bookRepo, ChapterRepo chapterRepo) {

        return args -> {
            log.info("******************************    Preloading books... ******************************");

            Book theFellowship = bookRepo.save(new Book("The Fellowship Of The Ring"));
            initBook(chapterRepo, theFellowship);


            Book twoTowers = bookRepo.save(new Book("The Two Towers"));
            initBook(chapterRepo, twoTowers);

            Book returnGuessWho = bookRepo.save(new Book("The Return Of The King"));
            initBook(chapterRepo, returnGuessWho);

        };
    }

    @Bean
    CommandLineRunner initMovies(MovieRepo repo)    {
        return args -> {
            log.info("******************************    Preloading movies...    ******************************");
            log.info(repo.save(new Movie("The Lord of the Rings Series")).getName());
            log.info(repo.save(new Movie("The Hobbit Series")).getName());
        };
    }

    private void initBook(ChapterRepo chapterRepo, Book book) {
        log.info("\t" + book.getName());
        log.info(chapterRepo.save(new Chapter("Chapter One of" + book.getName(), book)).getChapterName());
        log.info(chapterRepo.save(new Chapter("Chapter Two of " + book.getName(), book)).getChapterName());
    }

}
