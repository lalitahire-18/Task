package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;
public interface CategoryDao extends JpaRepository<Category,Integer>{
	
	
	Category save(Category e);
	int deleteById(int id);
	Category findById(int id);
	List<Category> findAll();
//	List<Category> findByEname(String ename);
//	Category findByEidAndEname(int eid,String ename);
//	List<Category> findByEnameAndEcompany(String Ename,String Ecompany);
//	List<Category> findByEnameOrEcompany(String ename,String ecompany);
//	List<Category> findByEidIn(List<Integer> eid);
//	List<Category> findByEidBetween(int low,int high);
//	List<Category> findByEnameContains(String ename);
	
	

}
