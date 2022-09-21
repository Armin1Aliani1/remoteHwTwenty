package com.hwTwenty.domain;

import com.hwTwenty.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Travel extends BaseEntity<Long> {
    private String source;

    private String destination;

    private String dateOfDeparture;

    private String departureTime;

    @OneToMany
    @JoinColumn(name = "travel_id")
    private List<Ticket> ticket;

    public Travel() {
    }

    public Travel(String source, String destination, String dateOfDeparture, String departureTime, List<Ticket> ticket) {
        this.source = source;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.departureTime = departureTime;
        this.ticket = ticket;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }
}
