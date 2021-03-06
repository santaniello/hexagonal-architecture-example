package br.com.felipe.hexagonal.domain;

import lombok.Getter;

import java.math.BigDecimal;

public final class BankAccount {
    @Getter
    private Long id;
    @Getter
    private BigDecimal balance;

    public BankAccount(Long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public boolean withdraw(BigDecimal amount) {
        if(balance.compareTo(amount) < 0) {
            return false;
        }

        balance = balance.subtract(amount);
        return true;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

}