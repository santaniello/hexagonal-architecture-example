package br.com.felipe.hexagonal.repositories;


import br.com.felipe.hexagonal.BankAccount;

public interface GetAccountRepository {
    BankAccount getAccount(Long id);
}
