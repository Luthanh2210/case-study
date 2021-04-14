package com.codegym.casestudy.service.product;

import com.codegym.casestudy.model.Product;
import com.codegym.casestudy.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public Product save(Product product){
        return (Product) productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }
}
