package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.ProductDao;
import com.demo.model.Category;
import com.demo.model.Product;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao ed;

	@Override
	public Product save(Product e) {
	return	ed.save(e);
	}

	@Override
	public int deleteById(int id) {
		return ed.deleteById(id);
	}

	@Override
	public Product findById(int id) {
		return ed.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return ed.findAll();
	}

//	@Override
//	public List<Product> findByEname(String ename) {
//		return ed.findByEname(ename);
//	}
//
//	@Override
//	public Product findByEidAndEname(int eid, String ename) {
//	    return ed.findByEidAndEname(eid, ename);
//	}
//
//	@Override
//	public List<Product> findByEnameAndEcompany(String Ename, String Ecompany) {
//		return ed.findByEnameAndEcompany(Ename, Ecompany);
//	}
//
//	@Override
//	public List<Product> findByEnameOrEcompany(String ename, String ecompany) {
//		return ed.findByEnameOrEcompany(ename, ecompany);
//	}
//
//	@Override
//	public List<Product> findByEidIn(List<Integer> eid) {
//		return ed.findByEidIn(eid);
//	}
//
//	@Override
//	public List<Product> findByEidBetween(int low, int high) {
//		   return ed.findByEidBetween(low,high);
//	}
//
//	@Override
//	public List<Product> findByEnameContains(String ename) {
//	return ed.findByEnameContains(ename);
//	}

}
