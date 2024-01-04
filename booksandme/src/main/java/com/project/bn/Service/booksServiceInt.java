package com.project.bn.Service;

import java.util.List;

import com.project.bn.Entity.booksEntity;

public interface booksServiceInt {
	public List<booksEntity> getData();
	public List<booksEntity> getId(int id);
	public List<booksEntity> getIdandauthor(int id, String author);
	public void postData(booksEntity be);
	public void update(booksEntity be);
	public void delete(int id);
}
