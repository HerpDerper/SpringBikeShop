package com.example.BikeShop.repositories;

import com.example.BikeShop.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}