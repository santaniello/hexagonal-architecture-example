package br.com.felipe.hexagonal.adapters.in.web;

import br.com.felipe.hexagonal.application.port.in.BankAccountQuery;
import br.com.felipe.hexagonal.application.port.in.DepositCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class BanckAccountController {

    private final DepositCommand depositCommand;
    private final BankAccountQuery bankAccountQuery;

    @PostMapping(value = "/{id}/deposit/{amount}")
    void deposit(@PathVariable final Long id, @PathVariable final BigDecimal amount) {
        depositCommand.deposit(id,amount);
    }

    @GetMapping(value = "/{id}")
    BigDecimal withdraw(@PathVariable final Long id) {
        return bankAccountQuery.getAccountBalance(id);
    }
}
