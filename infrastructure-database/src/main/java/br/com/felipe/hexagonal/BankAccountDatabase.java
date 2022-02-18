package br.com.felipe.hexagonal;


import br.com.felipe.hexagonal.repositories.GetAccountRepository;
import br.com.felipe.hexagonal.repositories.UpdateBankBalanceRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BankAccountDatabase implements GetAccountRepository, UpdateBankBalanceRepository {

    private static Map<Long,BankAccount> accounts = new HashMap<>();

    static {
        accounts.put(1L,new BankAccount(1L, BigDecimal.TEN));
    }

    @Override
    public BankAccount getAccount(Long id) {
        return accounts.get(id);
    }

    @Override
    public void updateBalance(BankAccount bankAccount) {
        accounts.get(bankAccount.getId()).deposit(bankAccount.getBalance());
    }
}
