package br.com.felipe.hexagonal;

import br.com.felipe.hexagonal.repositories.GetAccountRepository;
import br.com.felipe.hexagonal.repositories.UpdateBankBalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class BankAccountService implements DepositCommand, BankAccountQuery {

    private final GetAccountRepository getAccountPort;
    private final UpdateBankBalanceRepository updateBankBalancePort;

    @Override
    public void deposit(Long id,BigDecimal value) {
        BankAccount account = getAccountPort.getAccount(id);
        updateBankBalancePort.updateBalance(account);
    }

    @Override
    public BigDecimal getAccountBalance(Long id) {
        return getAccountPort.getAccount(id).getBalance();
    }
}
