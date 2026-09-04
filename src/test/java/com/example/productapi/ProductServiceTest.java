package com.example.productapi;

import com.example.productapi.Product;
import com.example.productapi.repository.ProductRepository;
import com.example.productapi.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllProducts() {
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        when(productRepository.findAll()).thenReturn(java.util.Arrays.asList(product));
        List<Product> allProducts = productService.getAllProducts();
        assertEquals(1, allProducts.size());
        assertEquals("Product 1", allProducts.get(0).getName());
    }

    @Test
    void getProductById() {
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        when(productRepository.findById(1L)).thenReturn(java.util.Optional.of(product));
        Optional<Product> foundProduct = productService.getProductById(1L);
        assertTrue(foundProduct.isPresent());
        assertEquals("Product 1", foundProduct.get().getName());
    }

    @Test
    void saveProduct() {
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        when(productRepository.save(product)).thenReturn(product);
        Product savedProduct = productService.saveProduct(product);
        assertEquals("Product 1", savedProduct.getName());
    }

    @Test
    void updateProduct() {
        Product existingProduct = new Product("Product 1", 10.0, 100, "Category 1");
        Product updatedProduct = new Product("Product 1 Updated", 20.0, 200, "Category 1 Updated");
        when(productRepository.findById(1L)).thenReturn(java.util.Optional.of(existingProduct));
        when(productRepository.save(existingProduct)).thenReturn(updatedProduct);
        Optional<Product> result = productService.updateProduct(1L, updatedProduct);
        assertTrue(result.isPresent());
        assertEquals("Product 1 Updated", result.get().getName());
    }

    @Test
    void deleteProduct() {
        when(productRepository.existsById(1L)).thenReturn(true);
        boolean result = productService.deleteProduct(1L);
        assertTrue(result);
    }
}