package com.Inventory.Service;

import com.Inventory.Entity.Inventory;

public interface InventoryService {

	Inventory addInventory(Inventory inventory);
	void deleteInventory(long inventoryId);
	Inventory updateInventory(Inventory inventory,long inventoryId);
	Inventory searchInventory( long inventoryId);
}
