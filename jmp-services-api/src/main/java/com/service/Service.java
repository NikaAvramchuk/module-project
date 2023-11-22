package com.service;

import com.example.BankCard;
import com.example.Subscription;
import com.example.User;

import java.util.List;
import java.util.Optional;

public interface Service {
    void subscribe(BankCard card);
    Optional<Subscription> getSubscriptionByBankCardNumber(String cardName);
    List<User> getAllUsers();
}
