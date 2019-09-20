package com.busyqa.sprinng.Repository;

import com.busyqa.sprinng.Model.FilmCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategory, Integer> {
}
