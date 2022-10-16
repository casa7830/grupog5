package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Category;
import com.ciclo3.reto.retog5.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    /**
     * mostrar datos categoria
     */
    public List<Category> getCategories() {
        return repository.findAll();
    }

    /**
     * guardar datos categoria
     */
    public Category saveCategory(Category category) {
        return repository.save(category);
    }
    public Category getCategory(long id){
        return repository.findById(id).orElse(null);
    }
    public Category updateCategory(Category categoryUpd) {
        Category categoryOld = getCategory(categoryUpd.getId());
        categoryOld.setName(categoryUpd.getName());
        categoryOld.setDescription(categoryUpd.getDescription());
        return repository.save(categoryOld);
    }

    }






