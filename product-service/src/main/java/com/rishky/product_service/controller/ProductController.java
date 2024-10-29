package com.rishky.product_service.controller;

import com.rishky.product_service.dto.ProductRequest;
import com.rishky.product_service.dto.ProductResponse;
import com.rishky.product_service.modal.Product;
import com.rishky.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
     return productService.createProduct(productRequest);
    }

    @GetMapping
    public Map<String, Object> getAllProducts() {
        List<ProductResponse> products = productService.getAllProducts();

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Here is the list:");
        response.put("products", products);

        return response;
    }

}
