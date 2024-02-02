package com.vania.repositories;

import com.vania.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, String> {
    Boolean existsByMenuNameIsLike(String likePattern);
}
