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

    @GetMapping("v2/book")
    List<Book> all() {
        return bookRepo.findAll();
    }

    @GetMapping("v2/book/{id}")
    Book getBookById(@PathVariable Long id) throws BookNotFoundException {
        return bookRepo.findById(id)
                .orElseThrow(() -> new BookNotFoundException("There is no book with id="+id));
    }

    @GetMapping("v2/book/{id}/chapter")
    Chapters getChapters(@PathVariable Long id) throws BookNotFoundException {

        //TODO: call bookRepo only
        Book book = bookRepo.getById(id);

        return new Chapters(chapterRepo.findByBook(book));
    }
}

class Chapters  {
    private List<Chapter> docs;

    public Chapters() {
    }

    public Chapters(List<Chapter> docs) {
        this.docs = docs;
    }

    public List<Chapter> getDocs() {
        return docs;
    }
}
