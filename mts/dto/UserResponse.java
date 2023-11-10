package com.cg.mts.dto;

public class UserResponse {
    private int userId;
    private String username;
    private String role;
    private int customerId;
    public UserResponse() {

    }
    public UserResponse(int userId, String username, String role, int customerId) {
        this.userId = userId;
        this.username = username;
        this.role = role;
        this.customerId = customerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

  
}