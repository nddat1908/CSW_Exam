package com.example.nguyendacdat.controller;

import com.example.nguyendacdat.entity.ProductEntity;
import com.example.nguyendacdat.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    ProductService productService;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        return "index";
    }


}
