package com.example;

public class BankCard {
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String number;
    private User user;

    public BankCard() {
    }
    protected BankCard(String number, User user) {
        this.number = number;
        this.user = user;
    }

}
