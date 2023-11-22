package com.bank.impl;

import com.bank.Bank;
import com.example.BankCard;
import com.example.BankCardType;
import com.example.CreditBankCard;
import com.example.DebitBankCard;
import com.example.User;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BankImpl implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        switch (bankCardType) {
            case DEBIT:
                return new DebitBankCard(generateRandomNumber(), user);
            case CREDIT:
                return new CreditBankCard(generateRandomNumber(), user);
        }
        return null;
    }

    private String generateRandomNumber() {
        return IntStream.range(0, 16)
                .mapToObj(number -> new Random().nextInt(10))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
