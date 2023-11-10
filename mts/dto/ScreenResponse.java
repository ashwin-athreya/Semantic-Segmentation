package com.cg.mts.dto;

import java.util.List;

public class ScreenResponse {
    private int screenId;
    private int theatreId;
    private List<Integer> showIds;
    private String screenName;
    private int rows;
    private int columns;
    public ScreenResponse() {

    }
    public ScreenResponse(int screenId, int theatreId, List<Integer> showIds, String screenName, int rows, int columns) {
        this.screenId = screenId;
        this.theatreId = theatreId;
        this.showIds = showIds;
        this.screenName = screenName;
        this.rows = rows;
        this.columns = columns;
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

    public List<Integer> getShowIds() {
        return showIds;
    }

    public void setShowIds(List<Integer> showIds) {
        this.showIds = showIds;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}

   
}