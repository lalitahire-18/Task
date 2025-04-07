package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	Product save(Product e);
	int deleteById(int eid);
	Product findById(int eid);
	List<Product> findAll();
//	List<Product> findByEname(String ename);
//	Product findByEidAndEname(int eid,String ename);
//	List<Product> findByEnameAndEcompany(String Ename,String Ecompany);
//	List<Product> findByEnameOrEcompany(String ename,String ecompany);
//	List<Product> findByEidIn(List<Integer> eid);
//	List<Product> findByEidBetween(int low,int high);
//	List<Product> findByEnameContains(String ename);
}
