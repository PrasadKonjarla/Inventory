package com.Inventory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Inventory.Entity.Inventory;
import com.Inventory.Service.InventoryService;

@RestController
@RequestMapping("/api")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	@GetMapping("/inventory/{id}")
	public ResponseEntity<Inventory> searchInventoryById(@RequestParam long inventoryId) {
		inventoryService.searchInventory(inventoryId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/inventory")
	public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory) {
		inventoryService.addInventory(inventory);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/inventory/{id}")
	public ResponseEntity<Inventory> updateInventory(@RequestBody Inventory inventory, @RequestParam long inventoryId) {
		inventoryService.updateInventory(inventory, inventoryId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/inventory/{id}")
	public ResponseEntity<Inventory> deleteInventory(@RequestParam long inventoryId) {
		inventoryService.deleteInventory(inventoryId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
