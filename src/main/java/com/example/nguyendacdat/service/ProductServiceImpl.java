package com.example.nguyendacdat.service;


import com.example.nguyendacdat.dto.MapperDto;
import com.example.nguyendacdat.entity.ProductEntity;
import com.example.nguyendacdat.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

//    @Autowired
//    MapperDto mapperDto;

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity save(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public ProductEntity getProductById(int id) {
        return productRepo.findById(id).get();
    }
}
