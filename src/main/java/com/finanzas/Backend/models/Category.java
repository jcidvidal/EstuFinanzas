package com.finanzas.Backend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Categories")
public class Category {

    @Id
    private String id;
    private String name; // Ej: "Beca JUNAEB", "Ropa", "Comida"
    private CategoryType type; // INCOME o EXPENSE

}
