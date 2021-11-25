package com.awesomebank.loan.configs;

import com.awesomebank.loan.entities.Loan;
import com.awesomebank.loan.repositories.LoanRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
@RequiredArgsConstructor
public class StartupConfig implements ApplicationRunner {
    private final LoanRepository loanRepository;

    @Override
    public void run(ApplicationArguments args) {
        if (loanRepository.findAll().isEmpty()) {
            loanRepository.saveAll(Arrays.asList(
                    Loan.builder().amount(10000).build(),
                    Loan.builder().amount(11000).build(),
                    Loan.builder().amount(12000).build()
            ));
        }
    }
}
