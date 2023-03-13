package com.example.demo.Record;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "record")
@Table(name = "record")
@IdClass(RecordId.class)
public class Record {
    @Id
    @SequenceGenerator(name = "bookId_sequence",
            sequenceName = "bookId_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "bookId_sequence"
    )
    @Column(name = "book_id",
            nullable = false
    )
    private Long bookId;

    @Id
    @Column(name = "guest_id",
            nullable = false
    )
    private Long guestId;
    @Column(name = "date",
            nullable = false,
            columnDefinition = "Date"

    )
    private LocalDate date;

    public Record() {
    }

    public Record(LocalDate date) {

        this.date = date;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



}
