package com.busyqa.sprinng.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private int categoryId;

    private String name;

    private Date lastUpdate;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @OneToOne
    private FilmCategory filmCategory;

    public Category(int categoryId){
        this.categoryId = categoryId;
    }



    @Override
    public String toString(){
        return categoryId+", "+name+", "+lastUpdate;
    }


}
