package com.bank;

import com.example.BankCard;
import com.example.BankCardType;
import com.example.User;

public interface Bank {
    BankCard createBankCard(User user, BankCardType bankCardType);
}
