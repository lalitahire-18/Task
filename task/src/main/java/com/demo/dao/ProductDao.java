package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	Product save(Product e);
	int deleteById(int id);
	Product findById(int id);
	List<Product> findAll();
//	List<Product> findByEname(String ename);
//	Product findByEidAndEname(int eid,String ename);
//	List<Product> findByEnameAndEcompany(String Ename,String Ecompany);
//	List<Product> findByEnameOrEcompany(String ename,String ecompany);
//	List<Product> findByEidIn(List<Integer> eid);
//	List<Product> findByEidBetween(int low,int high);
//	List<Product> findByEnameContains(String ename);
	
	

}
