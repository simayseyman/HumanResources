package com.example.jforce.demo;

import com.example.jforce.demo.dto.APIResponse;
import com.example.jforce.demo.entity.Inventory;
import com.example.jforce.demo.services.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoInventoryRestServices {
    @GetMapping("/pagination_inventory")
    private APIResponse<Page<Inventory>> getInventioriesWithPagination(@RequestParam(value = "offset", defaultValue = "0") int offset,
                                                                   @RequestParam(value = "pageSize", defaultValue = "1")  int pageSize) {
        Page<Inventory> inventoriesWithPagination = inventoryService.findProductsWithPagination(offset, pageSize);
        return new APIResponse<>(inventoriesWithPagination.getSize(), inventoriesWithPagination );
    }
    @Autowired
    private IInventoryService inventoryService;

    @GetMapping(path = "/getInventories")
    public List<Inventory> getInventories(){

        return inventoryService.listAll();
    }

    @GetMapping("/Storages")
    public List<Inventory> getStorages(){
        return inventoryService.InStorage();
    }

    @DeleteMapping(path = "/deleteInventory/{id}")
    public Inventory deleteInventory(@PathVariable(name = "id") Long id ) {
        return inventoryService.delete(id);
    }

    @PostMapping(path = "/addInventory")
    public Inventory createInventory(@RequestBody Inventory inventory) {
        return inventoryService.insert(inventory);
    }
    @PostMapping(path = "/postInventories")
    public List<Inventory> addInventoryAll(@RequestBody List<Inventory> newInventoryList) {
        return inventoryService.insertAll(newInventoryList);
    }
    @GetMapping(path = "/getInventory/{id}")
    public Inventory getById(@PathVariable(name="id")Long id){
        return inventoryService.getInventory(id);
    }

    @PutMapping(path = "/inventory/{id}")
    public Inventory updateInventory(@PathVariable(name = "id")Long id, @RequestBody Inventory inventory) {
        return inventoryService.update(id, inventory);

    }
}
