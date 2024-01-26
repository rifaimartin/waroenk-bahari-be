package com.vania.repositories;

import com.vania.entities.MenuCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuCategoryRepository extends JpaRepository<MenuCategory, String> {
    Boolean existsByCategoryNameIsLike(String likePattern);
}
