package com.awesomebank.loan.controllers;

import com.awesomebank.loan.entities.Loan;
import com.awesomebank.loan.services.LoanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/loans")
public class LoanController {
    private final LoanService cardService;

    @GetMapping
    public ResponseEntity<List<Loan>> getCardList() {
        return ResponseEntity.ok(cardService.getCards());
    }

    @GetMapping("{id}")
    public ResponseEntity<Loan> getCardById(@PathVariable Long id) {
        return ResponseEntity.ok(cardService.getCardsById(id));
    }

}
