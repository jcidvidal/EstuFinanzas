package com.finanzas.Backend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("Incomes")
public class Income {

    @Id
    private String id;
    private double amount;
    private String description;
    private LocalDate date;
    private String categoryId;
}
