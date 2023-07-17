package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.Employee;
import com.example.jforce.demo.entity.Inventory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IInventoryService {

    List<Inventory> listAll();

    Inventory delete(Long id);

    Inventory insert(Inventory inventory);

    Inventory getInventory(Long id);

    Inventory update(Long id, Inventory inventory);

    List<Inventory> insertAll(List<Inventory> newInventoryList);

    Page<Inventory> findProductsWithPagination(int offset, int pageSize);

    List<Inventory> InStorage();
}
