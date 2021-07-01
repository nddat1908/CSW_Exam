package com.example.nguyendacdat.service;

import com.example.nguyendacdat.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProduct();
    ProductEntity save(ProductEntity p);
    ProductEntity getProductById(int id);

}
