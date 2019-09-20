package com.busyqa.sprinng.Service;

import com.busyqa.sprinng.Model.Category;
import com.busyqa.sprinng.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepositery;
    public List<Category> findAll(){
        return categoryRepositery.findAll();
    }

 //   public Category findByCategoryId(int id){
   //     return categoryRepositery.findById(id).orElse(null);
   // }
}
