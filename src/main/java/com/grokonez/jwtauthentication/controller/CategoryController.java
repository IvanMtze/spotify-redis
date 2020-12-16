package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Album;
import com.grokonez.jwtauthentication.model.Category;
import com.grokonez.jwtauthentication.model.Playlist;
import com.grokonez.jwtauthentication.repository.CategoryRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api( tags = "category")
@RequestMapping("/api/category")
public class CategoryController{

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository playlistRepository){
        categoryRepository = playlistRepository;
    }

    @GetMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Map<Long, Category> GetAll(){
        return categoryRepository.findAll();
    }
    @PostMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Category add(@RequestBody Category category){
        categoryRepository.save(new Category());
        return categoryRepository.findById(category.getId());
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Boolean delete(@PathVariable Long id){
        return categoryRepository.delete(id);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Category getById(@PathVariable Long id){
        return categoryRepository.findById(id);
    }
}
