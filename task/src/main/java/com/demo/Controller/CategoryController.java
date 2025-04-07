package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	@Autowired
	private CategoryService cs;
	
	
	
	@GetMapping("/{id}")
	public Category c1(@PathVariable int id)
	{
		return cs.findById(id);
	}
	
	@PostMapping
	public Category c2(@RequestBody Category c)
	{
		return cs.save(c);
	}
	
	@DeleteMapping("/{id}")
	public int c3(@PathVariable int id)
	{
		return cs.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Category c4(@PathVariable int id,@RequestBody Category c)
	{
		return cs.save(c);
	}
	
    @GetMapping("/page={id}")
    public List<Category> c5(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id,asc") String[] sort) {

        return cs.findAll();
    }
   
}
