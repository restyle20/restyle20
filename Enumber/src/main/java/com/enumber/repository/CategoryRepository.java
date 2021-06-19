package com.enumber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.enumber.model.Category;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
