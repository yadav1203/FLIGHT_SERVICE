package com.CodeTech.Flight.Service.Entiry;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_USER")
@Entity
public class Users {
//    private Long id;
//    private String name;
//    private String email;
//    private String password;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "BUDDA_AAGE")
    private int age;


    private String name;


    @Email(message = "Email should be valid")
    private String email;
    private String address;



}
