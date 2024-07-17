package com.network.demo.role;

import java.util.Optional;
import org.springframework.data.jpa.repository.*;;


public interface Rolerepository extends JpaRepository<Roles, Integer> {
    Optional<Roles> findByName(String name);  


}
