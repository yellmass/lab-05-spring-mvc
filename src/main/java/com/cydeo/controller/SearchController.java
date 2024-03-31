package com.cydeo.controller;

import com.cydeo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

    private ProductService productService;

    public SearchController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("search-product/{productName}")
    public String searchInfo(Model model, @PathVariable String productName){

        model.addAttribute("productList", productService.searchProduct(productName));

        return "product/product-list";
    }
}
