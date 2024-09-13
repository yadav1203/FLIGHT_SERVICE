package com.CodeTech.Flight.Service.Entiry;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Inventory")
public class User {

                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private Long id;
                private String username;
                private String email;
                // Getters and setters

//        private String name;
//        private int age;
//        private String email;
//        private Address address;
//        private boolean isVerified;

    }
