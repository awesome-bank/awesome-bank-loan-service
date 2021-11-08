package com.awesomebank.loan.services;


import com.awesomebank.loan.entities.Loan;

import java.util.List;

public interface LoanService {
    List<Loan> getCards();

    Loan getCardsById(Long id);
}
