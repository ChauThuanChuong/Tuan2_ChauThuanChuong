package com.demo.chauthuanchuong_product_service;

import java.util.List;

import com.demo.ChauThuanChuong_product_entity.Product;

public interface ProductSevice {
    public List<Product> getAllProduct();
    public void addProduct(Product product);

}
