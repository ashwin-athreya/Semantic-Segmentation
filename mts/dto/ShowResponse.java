package com.cg.mts.dto;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class ShowResponse {
    private int showId;
    private LocalDateTime showStartTime;
    private LocalDateTime showEndTime;
    private String showName;
    private int movieId;
    private int screenId;
    private int theatreId;
    private int bookingId;
    private LocalDate showDate;
    public ShowResponse() {

    }
    public ShowResponse(int showId, LocalDateTime showStartTime, LocalDateTime showEndTime, String showName, int movieId,
                        int screenId, int theatreId, int bookingId, LocalDate showDate) {
        this.showId = showId;
        this.showStartTime = showStartTime;
        this.showEndTime = showEndTime;
        this.showName = showName;
        this.movieId = movieId;
        this.screenId = screenId;
        this.theatreId = theatreId;
        this.bookingId = bookingId;
        this.showDate = showDate;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public LocalDateTime getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(LocalDateTime showStartTime) {
        this.showStartTime = showStartTime;
    }

    public LocalDateTime getShowEndTime() {
        return showEndTime;
    }

    public void setShowEndTime(LocalDateTime showEndTime) {
        this.showEndTime = showEndTime;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}

   
}