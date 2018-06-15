package hadi.jeddizahed.sample.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Book")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String author;

    @Embedded
    private Publisher publisher;

    public Book() {
    }

    public Book(String title, String author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
