package br.com.felipe.hexagonal.repositories;

import br.com.felipe.hexagonal.BankAccount;

public interface UpdateBankBalanceRepository {
    void updateBalance(BankAccount bankAccount);
}
