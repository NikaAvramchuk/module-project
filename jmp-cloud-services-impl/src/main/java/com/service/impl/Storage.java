package com.service.impl;

import com.example.BankCard;
import com.example.Subscription;
import com.example.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<User> users = new ArrayList<>();
    private List<BankCard> bankCards = new ArrayList<>();
    private List<Subscription> subscriptions = new ArrayList<>();

    public Storage() {
        users.add(new User("Nika", "Nika", LocalDate.now()));
        users.add(new User("Nika2", "Nika2", LocalDate.now()));

    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<BankCard> getBankCards() {
        return bankCards;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }
}
