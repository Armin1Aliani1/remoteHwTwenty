package com.hwTwenty.domain;

import com.hwTwenty.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Ticket extends BaseEntity<Long> {
    @ManyToOne
    private User user;

    @ManyToOne
    private Travel travel;

    public Ticket() {
    }

    public Ticket(User user, Travel travel) {
        this.user = user;
        this.travel = travel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }
}
