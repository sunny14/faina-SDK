package faina.sdk.repository;

import faina.sdk.entity.Book;
import faina.sdk.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChapterRepo extends JpaRepository<Chapter, Long> {

    List<Chapter> findByBook(Book book);
}
