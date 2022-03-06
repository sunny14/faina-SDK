package faina.sdk.rest;

import faina.sdk.entity.Book;
import faina.sdk.entity.Chapter;
import faina.sdk.exceptions.BookNotFoundException;
import faina.sdk.repository.BookRepo;
import faina.sdk.repository.ChapterRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookRepo bookRepo;
    private final ChapterRepo chapterRepo;

    BookController(BookRepo repository, ChapterRepo chapterRepo) {
        this.bookRepo = repository;
        this.chapterRepo = chapterRepo;
    }

    @GetMapping("/book")
    List<Book> all() {
        return bookRepo.findAll();
    }

    @GetMapping("/book/{id}")
    Book getBookById(@PathVariable Long id) throws BookNotFoundException {
        return bookRepo.findById(id)
                .orElseThrow(() -> new BookNotFoundException("There is no book with id="+id));
    }

    @GetMapping("/book/{id}/chapter")
    List<Chapter> getChapters(@PathVariable Long id) throws BookNotFoundException {

        //TODO
        Book book = bookRepo.getById(id);

        return chapterRepo.findByBook(book);
               // .orElseThrow(() -> new BookNotFoundException("No chapters found for a book id="+id));
    }
}
