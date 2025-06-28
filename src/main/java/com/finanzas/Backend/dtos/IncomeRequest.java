package com.finanzas.Backend.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeRequest {

    @Id
    private String id;
    private double amount;
    private String description;
    private LocalDate date;
}
