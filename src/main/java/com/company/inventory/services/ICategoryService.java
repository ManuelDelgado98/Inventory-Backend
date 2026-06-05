package com.company.inventory.services;

import com.company.inventory.response.CategoryResponseREST;
import org.springframework.http.ResponseEntity;

public interface ICategoryService {

    public ResponseEntity<CategoryResponseREST> search();

}
