package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.Inventory;
import com.example.jforce.demo.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InventoryServiceImpl implements IInventoryService {

    public Page<Inventory> findProductsWithPagination(int offset, int pageSize){
        Page<Inventory> inventories = inventoryRepository.findAll(PageRequest.of(offset, pageSize));
        return  inventories;
    }

    @Override
    public List<Inventory> InStorage() {
        return inventoryRepository.findByX("depository");
    }

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public List<Inventory> listAll(){
        return inventoryRepository.findAll();
    }

    @Override
    public Inventory delete(@PathVariable Long id) {
        Inventory inventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Inventory not exist with id :" + id));

        inventoryRepository.delete(inventory);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return inventory;
    }

    @Override
    public Inventory insert(@RequestBody Inventory inventory) {
        inventoryRepository.save(inventory);
        return inventory;
    }

    @Override
    public List<Inventory> insertAll(@RequestBody List<Inventory> newInventoryList ) {
        inventoryRepository.saveAll(newInventoryList);

        return newInventoryList;
    }

    @Override
    public Inventory getInventory(@PathVariable Long id){
        Inventory inventory = inventoryRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Inventory not exist with id :" + id));
        return inventory;
    }

    @Override
    public Inventory update(Long id, @RequestBody Inventory inventory) {
        Inventory inventories = inventoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Inventory not exist with id :" + id));

        inventories.setInventory_serial_number(inventory.getInventory_serial_number());
        inventories.setInventory_type(inventory.getInventory_type());
        inventories.setInventory_brand(inventory.getInventory_brand());
        inventories.setInventory_model(inventory.getInventory_model());
        inventories.setInventory_entry_date(inventory.getInventory_entry_date());
        inventories.setInventory_situation(inventory.getInventory_situation());

        Inventory updatedInventory = inventoryRepository.save(inventory);
        return updatedInventory;
    }
}
