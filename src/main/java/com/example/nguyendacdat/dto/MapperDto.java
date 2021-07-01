package com.example.nguyendacdat.dto;

import com.example.nguyendacdat.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDto {
    ProductEntity convertToEntity(ProductDto productDto);
}
