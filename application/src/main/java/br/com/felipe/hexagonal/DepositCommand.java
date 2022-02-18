package br.com.felipe.hexagonal;

import java.math.BigDecimal;

public interface DepositCommand {
    void deposit(final Long id, final BigDecimal value);
}
