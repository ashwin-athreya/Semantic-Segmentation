package com.cg.mts.dto;

public class SeatResponse {
    private int seatId;
    private String seatNumber;
    private String type;
    private double price;
    private String status;
    private int ticketId;
    public SeatResponse() {

    }
    public SeatResponse(int seatId, String seatNumber, String type, double price, String status, int ticketId) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.type = type;
        this.price = price;
        this.status = status;
        this.ticketId = ticketId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

   
}