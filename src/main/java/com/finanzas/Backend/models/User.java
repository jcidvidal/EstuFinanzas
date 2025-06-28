package com.finanzas.Backend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("Users")
public class User {

    @Id
    private String id;

    private String name;
    private String lastName;
    private String ruth;
    private String email;
    private String password;
    private String role;
}
