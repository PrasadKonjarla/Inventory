package com.Inventory.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Inventory.Entity.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Long> {

}
