package com.hwTwenty.domain;

import com.hwTwenty.base.BaseEntity;
import com.hwTwenty.enumiration.Gender;

import javax.persistence.*;
import java.util.List;

@Entity
public class User extends BaseEntity<Long> {
    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String phoneNumber;

    private String nationalCode;

    private String birthDate;

    private String username;

    private String password;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Ticket> ticket;

    public User() {
    }

    public User(String firstName, String lastName, Gender gender, String phoneNumber, String nationalCode, String birthDate, String username, String password, List<Ticket> ticket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.nationalCode = nationalCode;
        this.birthDate = birthDate;
        this.username = username;
        this.password = password;
        this.ticket = ticket;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
