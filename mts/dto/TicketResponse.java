package com.cg.mts.dto;

import java.util.List;

public class TicketResponse {
    private int ticketId;
    private int noOfSeats;
    private boolean ticketStatus;
    private List<Integer> seatIds;
    private int bookingId;
    public TicketResponse() {

    }
    public TicketResponse(int ticketId, int noOfSeats, boolean ticketStatus, List<Integer> seatIds, int bookingId) {
        this.ticketId = ticketId;
        this.noOfSeats = noOfSeats;
        this.ticketStatus = ticketStatus;
        this.seatIds = seatIds;
        this.bookingId = bookingId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public List<Integer> getSeatIds() {
        return seatIds;
    }

    public void setSeatIds(List<Integer> seatIds) {
        this.seatIds = seatIds;
    }
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

   
}