package com.project.bn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.bn.Entity.booksEntity;
import com.project.bn.Service.booksService;
@CrossOrigin
@RestController
public class booksController {
	@Autowired
	private booksService bs;
	@GetMapping("/books")
	public List<booksEntity> getData(){
		return bs.getData();
	}
	@PostMapping("/postbooks")
	public void post(@RequestBody booksEntity be)
	{
		bs.postData(be);
	}
	@PutMapping("/updatebooks")
	public void update(@RequestBody booksEntity be,@RequestParam int id)
	{
		be.setId(id); 
		bs.update(be);
	}
	@DeleteMapping("/deletebooks/{id}")
	public void delete(@PathVariable int id)
	{
		bs.delete(id);
	}
	@GetMapping("/findid")
	public List<booksEntity> getId(int id)
	{
		return bs.getId(id);
	}
	@GetMapping("/findidandauthor")
	public List<booksEntity> getIdandauthor(int id, String author)
	{
		return bs.getIdandauthor(id, author);
	}
}
