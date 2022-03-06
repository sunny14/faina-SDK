package faina.sdk.entity;

import javax.persistence.*;

@Entity
public class Chapter {

    private @Id @GeneratedValue(strategy= GenerationType.SEQUENCE) Long id;
    private String chapterName;

    @ManyToOne
    private Book book;

    public Chapter(String chapterName, Book book) {
        this.chapterName = chapterName;
        this.book = book;
    }

    public Chapter() {
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Long get_id() {
        return id;
    }


}
