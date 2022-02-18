package br.com.felipe.hexagonal;

import java.math.BigDecimal;

public interface BankAccountQuery {
    BigDecimal getAccountBalance(final Long id);
}
