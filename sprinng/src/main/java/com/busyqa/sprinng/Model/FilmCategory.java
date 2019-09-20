package com.busyqa.sprinng.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

@Entity
public class FilmCategory {

    @Id
    @GeneratedValue
    private int categoryId;

    private int filmId;

    private Date lastUpdate;

    @OneToOne(mappedBy = "FilmCategoryRepository", cascade = CascadeType.ALL)
    private Set<Category> Category;

    public FilmCategory(int categoryId, com.busyqa.sprinng.Model.Category category, com.busyqa.sprinng.Model.Category category1){

        this.categoryId = categoryId;
        this.Category = of((Category) null).collect(Collectors.toSet());
        this.Category.forEach(FilmCategory -> FilmCategory.setCategoryId(categoryId));

    }

}
