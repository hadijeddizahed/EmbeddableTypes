package hadi.jeddizahed.sample.entities;

import javax.persistence.*;

@Entity(name = "Book")
@AttributeOverrides({
        @AttributeOverride(
                name = "ebookPublisher.name",
                column = @Column(name = "ebook_publisher_name")
        ),
        @AttributeOverride(
                name = "paperBackPublisher.name",
                column = @Column(name = "paper_back_publisher_name")
        ),
        @AttributeOverride(
                name = "ebookPublisher.country",
                column = @Column(name = "ebook_publisher_country")
        ),
        @AttributeOverride(
                name = "paperBackPublisher.country",
                column = @Column(name = "paper_back_publisher_country")
        )
})
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String author;

    @Embedded
    private Publisher ebookPublisher;

    @Embedded
    private Publisher paperBackPublisher;

    public Book() {
    }

    public Book(String title, String author, Publisher ebookPublisher, Publisher paperBackPublisher) {
        this.title = title;
        this.author = author;
        this.ebookPublisher = ebookPublisher;
        this.paperBackPublisher = paperBackPublisher;
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

    public Publisher getEbookPublisher() {
        return ebookPublisher;
    }

    public Publisher getPaperBackPublisher() {
        return paperBackPublisher;
    }
}
