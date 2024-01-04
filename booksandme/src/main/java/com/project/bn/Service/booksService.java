package com.project.bn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bn.Entity.booksEntity;
import com.project.bn.Repository.booksRepoInt;
@Service
public class booksService implements booksServiceInt {
	@Autowired
	private booksRepoInt bri;
	@Override
	public List<booksEntity> getData() {
		
		return bri.findAll();
	}
	public void postData(booksEntity be) {
		bri.save(be);
		
	}
	public void update(booksEntity be) {
		bri.save(be);
		
	}
	public void delete(int id) {
		bri.deleteById(id);
	}
	@Override
	public List<booksEntity> getId(int id) {
		
		return bri.findByid(id);
	}
	@Override
	public List<booksEntity> getIdandauthor(int id, String author) {
		
		return bri.findByIdAndAuthor(id, author);
	}
	
	
}
