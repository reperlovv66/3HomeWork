package com.example.a3homework;

public class RailwayTicketPensioner extends RailwayTicket {
    private float ticketDiscount;

    public RailwayTicketPensioner(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (70 - ticketDiscount))/100;
    }
}
