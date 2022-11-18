package com.huseyinaydin.sha.springbootmicroservice1product.service;

import org.springframework.stereotype.Service;

import com.huseyinaydin.sha.springbootmicroservice1product.model.Product;
import com.huseyinaydin.sha.springbootmicroservice1product.repository.IProductRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Hüseyin Aydın
 * @date 11.04.2021
 * @time 18:23
 */
@Service
public class ProductService implements IProductService
{
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product)
    {
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId)
    {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts()
    {
        return productRepository.findAll();
    }
}
