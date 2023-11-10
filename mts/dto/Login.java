package com.cg.mts.dto;

public class Login {
    private boolean loginStatus;
    private UserResponse user;

    public Login() {

    }

    public Login(boolean loginStatus, UserResponse user) {
        this.loginStatus = loginStatus;
        this.user = user;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
        this.user = user;
    }

  public String getRole() {
	  return user.getRole();
  }
}