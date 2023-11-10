package com.cg.mts.dto;

import java.time.LocalDate;

public class BookingResponse {
    private int transactionId;
    private ShowResponse show;
    private LocalDate bookingDate;
    private String transactionMode;
    private String transactionStatus;
    private double totalCost;
    private int customerId;
    private int ticketId;

    public BookingResponse() {};
    public BookingResponse(int transactionId, ShowResponse show, LocalDate bookingDate, String transactionMode,
                           String transactionStatus, double totalCost, int customerId, int ticketId) {
        this.transactionId = transactionId;
        this.show = show;
        this.bookingDate = bookingDate;
        this.transactionMode = transactionMode;
        this.transactionStatus = transactionStatus;
        this.totalCost = totalCost;
        this.customerId = customerId;
        this.ticketId = ticketId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    

    public ShowResponse getShow() {
		return show;
	}
	public void setShow(ShowResponse show) {
		this.show = show;
	}
	public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getTransactionMode() {
        return transactionMode;
    }

    public void setTransactionMode(String transactionMode) {
        this.transactionMode = transactionMode;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

  
}