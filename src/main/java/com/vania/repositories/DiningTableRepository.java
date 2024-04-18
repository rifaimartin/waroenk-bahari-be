package com.vania.repositories;

import com.vania.entities.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiningTableRepository extends JpaRepository<DiningTable, String> {
    Boolean existsByNumberDiningTable(String likePattern);
}
