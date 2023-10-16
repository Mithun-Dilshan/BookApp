package com.ijse.BookApp.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.BookApp.Entity.SubCategory;
@Repository



public interface SubCategoryRepositary extends JpaRepository<SubCategory,Long> {

    
    
}
