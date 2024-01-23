package com.demo.chauthuanchuong_product_reponsity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ChauThuanChuong_product_entity.Product;

public interface ProductReponsity extends JpaRepository<Product,Integer> {
}
