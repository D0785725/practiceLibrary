package com.example.demo.Publisher;

import jakarta.persistence.*;

@Entity(name = "publisher")
@Table(name = "publisher")
public class Publisher {

    @Id
    @SequenceGenerator(
            name = "publisher_sequence",
            sequenceName = "publisher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "pub_id",
            nullable = false
    )
    private long pubId;
    @Column(
            name = "pub_name",
            nullable = false
    )
    private String pubName;
    @Column(
            name = "contact",
            nullable = false
    )
    private String contact;
    @Column(
            name = "tel",
            nullable = false,
            unique = true
    )
    private String tel;
    @Column(
            name = "address",
            nullable = false
    )
    private String address;

    public Publisher() {
    }

    public Publisher(String pubName, String contact, String tel, String address) {
        this.pubName = pubName;
        this.contact = contact;
        this.tel = tel;
        this.address = address;
    }

    public long getPubId() {
        return pubId;
    }

    public void setPubId(long pubId) {
        this.pubId = pubId;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
