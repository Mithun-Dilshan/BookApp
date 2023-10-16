package com.ijse.BookApp.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.BookApp.Entity.Category;
@Repository

public interface CategoryRepositary extends JpaRepository<Category, Long> {
    
}
