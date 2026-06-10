package com.company.inventory.services;

import com.company.inventory.model.Category;
import com.company.inventory.response.CategoryResponseREST;
import org.springframework.http.ResponseEntity;

public interface ICategoryService {

    public ResponseEntity<CategoryResponseREST> search();
    public ResponseEntity<CategoryResponseREST> searchById(Long id);
    public ResponseEntity<CategoryResponseREST> save(Category category);

}
