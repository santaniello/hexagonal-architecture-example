package br.com.felipe.hexagonal.application.port.out;

import br.com.felipe.hexagonal.domain.BankAccount;

public interface GetAccountRepository {
    BankAccount getAccount(Long id);
}
