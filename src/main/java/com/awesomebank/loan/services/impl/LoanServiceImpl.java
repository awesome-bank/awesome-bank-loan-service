package com.awesomebank.loan.services.impl;

import com.awesomebank.loan.entities.Loan;
import com.awesomebank.loan.exceptions.LoanNotFoundException;
import com.awesomebank.loan.repositories.LoanRepository;
import com.awesomebank.loan.services.LoanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;

    @Override
    public List<Loan> getCards() {
        return loanRepository.findAll();
    }

    @Override
    public Loan getCardsById(Long id) {
        return loanRepository.findById(id).orElseThrow(()-> new LoanNotFoundException(String.format("Could not find loan with id: %s", id)));
    }
}
