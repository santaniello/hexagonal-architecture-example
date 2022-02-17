package br.com.felipe.hexagonal.application.port.in;

import java.math.BigDecimal;

public interface BankAccountQuery {
    BigDecimal getAccountBalance(final Long id);
}
