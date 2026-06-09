package com.company.inventory.controller;

import com.company.inventory.response.CategoryResponseREST;
import com.company.inventory.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {

    @Autowired
    private ICategoryService service;

    /**
     * get all the categories
     * @return
     */

    @GetMapping("/categories")
    public ResponseEntity<CategoryResponseREST> searchCategories() {

        ResponseEntity<CategoryResponseREST> response = service.search();
        return response;
    }

    /**
     * get categories by id
     * @param id
     * @return
     */
    @GetMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseREST> searchCategoriesById(@PathVariable Long id) {

        ResponseEntity<CategoryResponseREST> response = service.searchById(id);
        return response;
    }

}
