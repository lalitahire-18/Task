package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.CategoryDao;
import com.demo.model.Category;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDao ed;

	@Override
	public Category save(Category e) {
	return	ed.save(e);
	}

	@Override
	public int deleteById(int id) {
		return ed.deleteById(id);
	}

	@Override
	public Category findById(int eid) {
		return ed.findById(eid);
	}

	@Override
	public List<Category> findAll() {
		return ed.findAll();
	}

	//@Override
//	public List<Category> findByEname(String ename) {
//		return ed.findByEname(ename);
//	}
//
//	@Override
//	public Category findByEidAndEname(int eid, String ename) {
//	    return ed.findByEidAndEname(eid, ename);
//	}
//
//	@Override
//	public List<Category> findByEnameAndEcompany(String Ename, String Ecompany) {
//		return ed.findByEnameAndEcompany(Ename, Ecompany);
//	}
//
//	@Override
//	public List<Category> findByEnameOrEcompany(String ename, String ecompany) {
//		return ed.findByEnameOrEcompany(ename, ecompany);
//	}
//
//	@Override
//	public List<Category> findByEidIn(List<Integer> eid) {
//		return ed.findByEidIn(eid);
//	}
//
//	@Override
//	public List<Category> findByEidBetween(int low, int high) {
//		   return ed.findByEidBetween(low,high);
//	}
//
//	@Override
//	public List<Category> findByEnameContains(String ename) {
//	return ed.findByEnameContains(ename);
//	}
	

}
