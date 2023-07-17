package com.example.jforce.demo.repository;

import com.example.jforce.demo.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    @Query("select i from Inventory i where i.inventory_situation =:searchCriter")
    List<Inventory> findByX(String searchCriter);
}
