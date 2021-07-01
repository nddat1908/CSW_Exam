package com.example.nguyendacdat.controller;

import com.example.nguyendacdat.dto.MapperDto;
import com.example.nguyendacdat.dto.ProductDto;
import com.example.nguyendacdat.entity.ProductEntity;
import com.example.nguyendacdat.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService userService;

    @Autowired
    MapperDto mapperDto;

    @GetMapping
    private ResponseEntity getProduct(Model model) {
        List<ProductEntity> list = userService.getAllProduct();
//        System.out.println("ListUser: " + list);
//        model.addAttribute("list",list);
        return ResponseEntity.ok(list);
    }

    @PostMapping
    private ResponseEntity createProduct(@RequestBody ProductDto productDto) {
        ProductEntity userEntity = mapperDto.convertToEntity(productDto);
        return ResponseEntity.ok(userService.save(userEntity));
    }

    @PutMapping
    private ResponseEntity sellProduct(@RequestBody ProductDto productDto) {
        ProductEntity productEntity = mapperDto.convertToEntity(productDto);
        return ResponseEntity.ok(userService.save(productEntity));
    }
}
