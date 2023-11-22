package com.service.impl;

import com.example.BankCard;
import com.example.Subscription;
import com.example.User;
import com.service.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ServiceImpl implements Service {
    Storage storage;

    public ServiceImpl() {
        storage = new Storage();
    }

    @Override
    public void subscribe(BankCard card) {
        var subscription = new Subscription(card.getNumber(), LocalDate.now());
        storage.addSubscription(subscription);
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardName) {
        return storage.getSubscriptions().stream()
                .filter(subscription -> subscription.getBankcard().equals(cardName))
                .findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return storage.getUsers();
    }
}
