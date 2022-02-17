package br.com.felipe.hexagonal.application.services;

import br.com.felipe.hexagonal.application.port.in.BankAccountQuery;
import br.com.felipe.hexagonal.application.port.in.DepositCommand;
import br.com.felipe.hexagonal.application.port.out.GetAccountRepository;
import br.com.felipe.hexagonal.application.port.out.UpdateBankBalanceRepository;
import br.com.felipe.hexagonal.domain.BankAccount;
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
