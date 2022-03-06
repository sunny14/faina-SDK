package faina.sdk.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long _id;
    private String name;

    @OneToMany
    private Set<Chapter> chapters;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Long get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
