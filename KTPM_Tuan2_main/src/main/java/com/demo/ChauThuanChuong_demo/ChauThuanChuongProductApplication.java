package com.demo.ChauThuanChuong_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.demo.chauthuanchuong_product_entity")
public class ChauThuanChuongProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChauThuanChuongProductApplication.class, args);
	}

}
