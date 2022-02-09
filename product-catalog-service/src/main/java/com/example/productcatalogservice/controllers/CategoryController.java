package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.models.Catalog;
import com.example.productcatalogservice.models.Category;
import com.example.productcatalogservice.repositories.CatalogRepository;
import com.example.productcatalogservice.repositories.CategoryRepository;
import com.example.productcatalogservice.services.CatalogService;
import com.example.productcatalogservice.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }


    @PostMapping
    public ResponseEntity<Category> save(@RequestBody Category category) {
        Category savedCategory = categoryService.save(category);
        return ResponseEntity.ok().body(savedCategory);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Category> patchCategory(@PathVariable("id") String id, @RequestBody Category category) {
        Optional<Category> categoryData = categoryRepository.findById(id);
        if (categoryData.isPresent()) {
            Category category1 = categoryData.get();
            category1.setDescription(category.getDescription());
            category1.setAtBaseType(category.getAtBaseType());
            return new ResponseEntity<>(categoryRepository.save(category1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<HttpStatus> deleteCatalog(@PathVariable("id") String id) {
//        try {
//            catalogRepository.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable String id){
        categoryRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
