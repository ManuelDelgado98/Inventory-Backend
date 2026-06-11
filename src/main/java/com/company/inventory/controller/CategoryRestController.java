package com.company.inventory.controller;

import com.company.inventory.model.Category;
import com.company.inventory.response.CategoryResponseREST;
import com.company.inventory.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
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

    /**
     * save categories
     * @param category
     * @return
     */
    @PostMapping("/categories")
    public ResponseEntity<CategoryResponseREST> save(@RequestBody Category category) {

        ResponseEntity<CategoryResponseREST> response = service.save(category);
        return response;
    }

    /**
     * update categories
     * @param category
     * @param id
     * @return
     */
    @PutMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseREST> update(@RequestBody Category category, @PathVariable Long id) {

        ResponseEntity<CategoryResponseREST> response = service.update(category, id);
        return response;
    }

    /**
     * delete categorie
     * @param id
     * @return
     */
    @DeleteMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseREST> delete(@PathVariable Long id) {

        ResponseEntity<CategoryResponseREST> response = service.deleteById(id);
        return response;
    }

}
