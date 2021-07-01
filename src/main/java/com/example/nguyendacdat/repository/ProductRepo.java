package com.example.nguyendacdat.repository;

import com.example.nguyendacdat.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {
}
