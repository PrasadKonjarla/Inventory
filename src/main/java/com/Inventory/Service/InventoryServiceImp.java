package com.Inventory.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.Inventory.Entity.Inventory;
import com.Inventory.Repo.InventoryRepo;

public class InventoryServiceImp implements InventoryService {

	@Autowired
	private InventoryRepo inventoryRepo;
	@Override
	public Inventory addInventory(Inventory inventory) {
		
		return inventoryRepo.save(inventory);
	}

	@Override
	public void deleteInventory(long inventoryId) {
		inventoryRepo.deleteById(inventoryId);
	}

	@Override
	public Inventory updateInventory(Inventory inventory, long inventoryId) {
		Inventory actualInventory = inventoryRepo.findById(inventoryId).get();
		
		//operation
		
		return inventoryRepo.save(actualInventory);
	}

	@Override
	public Inventory searchInventory(long inventoryId) {
		
		return inventoryRepo.findById(inventoryId).get();
		
	}

}
