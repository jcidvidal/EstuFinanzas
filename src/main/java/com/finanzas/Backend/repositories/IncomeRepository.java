package com.finanzas.Backend.repositories;


import com.finanzas.Backend.models.Income;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends MongoRepository<Income, Long> {


}
