package com.finanzas.Backend.controllers;


import com.finanzas.Backend.models.Income;
import com.finanzas.Backend.services.IncomeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Incomes")
public class IncomeController {

    private final IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }


    @GetMapping
    public List<Income> findAll() {
        return incomeService.findAll();
    }

    @PostMapping
    public ResponseEntity<Income> createIncome(@Valid @RequestBody Income income) {

        Income savedIncome = incomeService.save(income); // usa tu repo acá
        return ResponseEntity.ok(savedIncome);
    }

}
