package com.ijse.BookApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.BookApp.Entity.SubCategory;

@Service




public interface SubCategoryService {
    List<SubCategory> getAllSubCategory();
    SubCategory getSubCategoryById(Long id);
    SubCategory CreatSubCategory( SubCategory subcategory);
    SubCategory updateSubCategory (Long id, SubCategory subcategory);
    void deleteSubCategory(Long id);    
}
