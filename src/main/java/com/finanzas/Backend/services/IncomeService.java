package com.finanzas.Backend.services;


import com.finanzas.Backend.models.Income;
import com.finanzas.Backend.repositories.IncomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {

    private final IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public List<Income> findAll() {
        return incomeRepository.findAll();
    }

    public Income create(Income income) {
        return incomeRepository.save(income);
    }

   public Income save(Income income) {
        return incomeRepository.save(income);
   }

   public void delete(Income income) {
        incomeRepository.delete(income);
   }

}
