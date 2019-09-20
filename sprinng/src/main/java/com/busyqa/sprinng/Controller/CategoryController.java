package com.busyqa.sprinng.Controller;

import com.busyqa.sprinng.Model.Category;
import com.busyqa.sprinng.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String listCategorys(Model model){

            List<Category> categorylist = categoryService.findAll();
            model.addAttribute("categoryList", categorylist);
            return "index";
    }

}
