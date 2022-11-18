package com.huseyinaydin.sha.springbootmicroservice1product.service;

import java.util.List;

import com.huseyinaydin.sha.springbootmicroservice1product.model.Product;

/**
 * @author Hüseyin Aydın
 * @date 11.04.2021
 * @time 18:23
 */
public interface IProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
