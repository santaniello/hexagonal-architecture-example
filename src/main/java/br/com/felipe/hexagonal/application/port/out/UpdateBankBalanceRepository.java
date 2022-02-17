package br.com.felipe.hexagonal.application.port.out;

import br.com.felipe.hexagonal.domain.BankAccount;

public interface UpdateBankBalanceRepository {
    void updateBalance(BankAccount bankAccount);
}
