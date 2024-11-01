package com.rishky.inventory.microservice.service;

import com.rishky.inventory.microservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;
    public boolean isInStock(String skuCode,Integer quantity){
        // find a inventory for a given skuCode where stored quantity>quantity//
      return  inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode,quantity);
    }
}
