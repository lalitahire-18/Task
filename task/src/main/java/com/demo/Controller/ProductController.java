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

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@GetMapping("/{id}")
	public Product p1(@PathVariable int id)
	{
		return ps.findById(id);
	}
	
	@PostMapping
	public Product c2(@RequestBody Product c)
	{
		return ps.save(c);
	}
	
	@DeleteMapping("/{id}")
	public int c3(@PathVariable int id)
	{
		return ps.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Product c4(@PathVariable int id,@RequestBody Product c)
	{
		return ps.save(c);
	}
	
    @GetMapping("/page={id}")
    public List<Product> c5(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id,asc") String[] sort) {

        return ps.findAll();
    }

}
