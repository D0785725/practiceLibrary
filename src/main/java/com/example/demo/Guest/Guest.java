package com.example.demo.Guest;

import jakarta.persistence.*;


@Entity(name = "guest")
@Table(name = "guest")
public class Guest {
    @Id
    @SequenceGenerator(name = "guest_sequence",
            sequenceName = "guest_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "quest_sequence"
    )
    @Column(name = "guset_id",
            nullable = false)
    private long guestId;
    @Column(name = "name",
            nullable = false)
    private String name;
    @Column(name = "sex",
            nullable = false)
    private SEX sex;
    @Column(name = "tel",
            nullable = false,
            unique = true
    )
    private String tel;
    @Column(name = "address",
            nullable = false)
    private String address;

    public Guest() {
    }

    public Guest(String name, SEX sex, String tel, String address) {
        this.name = name;
        this.sex = sex;
        this.tel = tel;
        this.address = address;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
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
