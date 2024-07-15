package com.network.demo.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface userrepostory extends JpaRepository<user, Integer> {
    Optional <user>findByName(String name);

}
