package com.example.productapi;

import com.example.productapi.Product;
import com.example.productapi.controller.ProductController;
import com.example.productapi.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllProducts() throws Exception {
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        List<Product> allProducts = Arrays.asList(product);
        when(productService.getAllProducts()).thenReturn(allProducts);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products")
                       .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(MockMvcResultMatchers.jsonPath("$.[0].name").value("Product 1"));
    }

    @Test
    void getProductById() throws Exception {
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        when(productService.getProductById(1L)).thenReturn(java.util.Optional.of(product));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products/1")
                       .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Product 1"));
    }

    @Test
    void createProduct() throws Exception {
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        when(productService.saveProduct(product)).thenReturn(product);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content("{\"name\":\"Product 1\",\"price\":10.0,\"stock\":100,\"category\":\"Category 1\"}"))
               .andExpect(status().isCreated())
               .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Product 1"));
    }

    @Test
    void updateProduct() throws Exception {
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        when(productService.updateProduct(1L, product)).thenReturn(java.util.Optional.of(product));
        mockMvc.perform(MockMvcRequestBuilders.put("/api/products/1")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content("{\"name\":\"Product 1\",\"price\":10.0,\"stock\":100,\"category\":\"Category 1\"}"))
               .andExpect(status().isOk())
               .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Product 1"));
    }

    @Test
    void deleteProduct() throws Exception {
        when(productService.deleteProduct(1L)).thenReturn(true);
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/products/1")
                       .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isNoContent());
    }
}