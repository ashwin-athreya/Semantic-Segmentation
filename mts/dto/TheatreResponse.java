package com.cg.mts.dto;

import java.util.List;

public class TheatreResponse {
    private int theatreId;
    private String theatreName;
    private String theatreCity;
    private String managerName;
    private String managerContact;
    private List<Integer> screenIds;
    private List<Integer> showIds;
    public TheatreResponse() {

    }
    public TheatreResponse(int theatreId, String theatreName, String theatreCity, String managerName,
                          String managerContact, List<Integer> screenIds, List<Integer> showIds) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.theatreCity = theatreCity;
        this.managerName = managerName;
        this.managerContact = managerContact;
        this.screenIds = screenIds;
        this.showIds = showIds;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getTheatreCity() {
        return theatreCity;
    }

    public void setTheatreCity(String theatreCity) {
        this.theatreCity = theatreCity;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerContact() {
        return managerContact;
    }

    public void setManagerContact(String managerContact) {
        this.managerContact = managerContact;
    }

    public List<Integer> getScreenIds() {
        return screenIds;
    }

    public void setScreenIds(List<Integer> screenIds) {
        this.screenIds = screenIds;
    }
	public List<Integer> getShowIds() {
		return showIds;
	}
	public void setShowIds(List<Integer> showIds) {
		this.showIds = showIds;
	}

   
}