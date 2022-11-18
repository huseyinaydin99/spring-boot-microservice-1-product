package com.huseyinaydin.sha.springbootmicroservice1product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.sha.springbootmicroservice1product.model.Product;

/**
 * @author Hüseyin Aydın
 * @date 11.04.2021
 * @time 18:16
 */
public interface IProductRepository extends JpaRepository<Product, Long>
{
}
