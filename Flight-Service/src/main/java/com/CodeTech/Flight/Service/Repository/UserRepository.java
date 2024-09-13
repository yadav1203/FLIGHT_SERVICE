package com.CodeTech.Flight.Service.Repository;


import com.CodeTech.Flight.Service.Entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods if needed
}
