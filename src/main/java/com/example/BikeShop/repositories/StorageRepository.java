package com.example.BikeShop.repositories;

import com.example.BikeShop.models.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<Storage, Long> {
}