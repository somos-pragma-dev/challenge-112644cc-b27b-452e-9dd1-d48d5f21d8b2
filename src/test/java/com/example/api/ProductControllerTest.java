package com.example.api;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductRepository productRepository;

    @Test
    void getAllProducts_shouldReturnEmptyList() throws Exception {
        mockMvc.perform(get("/api/products"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.length()", is(0)));
    }

    @Test
    void createProduct_shouldReturnCreatedProduct() throws Exception {
        Product product = new Product(null, "Test Product", 10.0, 100, "Test Category");

        mockMvc.perform(post("/api/products")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content(JsonUtil.toJson(product)))
               .andExpect(status().isCreated())
               .andExpect(jsonPath("$.name", is(product.getName())))
               .andExpect(jsonPath("$.price", is(product.getPrice())))
               .andExpect(jsonPath("$.stock", is(product.getStock())))
               .andExpect(jsonPath("$.category", is(product.getCategory())));
    }

    @Test
    void getProductById_shouldReturnProduct() throws Exception {
        Product product = productRepository.save(new Product(null, "Test Product", 10.0, 100, "Test Category"));

        mockMvc.perform(get("/api/products/" + product.getId()))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name", is(product.getName())))
               .andExpect(jsonPath("$.price", is(product.getPrice())))
               .andExpect(jsonPath("$.stock", is(product.getStock())))
               .andExpect(jsonPath("$.category", is(product.getCategory())));
    }

    @Test
    void updateProduct_shouldReturnUpdatedProduct() throws Exception {
        Product product = productRepository.save(new Product(null, "Test Product", 10.0, 100, "Test Category"));
        product.setName("Updated Product");
        product.setPrice(20.0);
        product.setStock(200);
        product.setCategory("Updated Category");

        mockMvc.perform(put("/api/products/" + product.getId())
                       .contentType(MediaType.APPLICATION_JSON)
                       .content(JsonUtil.toJson(product)))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name", is(product.getName())))
               .andExpect(jsonPath("$.price", is(product.getPrice())))
               .andExpect(jsonPath("$.stock", is(product.getStock())))
               .andExpect(jsonPath("$.category", is(product.getCategory())));
    }

    @Test
    void deleteProduct_shouldReturnNoContent() throws Exception {
        Product product = productRepository.save(new Product(null, "Test Product", 10.0, 100, "Test Category"));

        mockMvc.perform(delete("/api/products/" + product.getId()))
               .andExpect(status().isNoContent());
    }
}