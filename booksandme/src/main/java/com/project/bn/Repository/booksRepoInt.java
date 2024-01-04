package com.project.bn.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bn.Entity.booksEntity;
@Repository
public interface booksRepoInt extends JpaRepository<booksEntity, Integer> {
	public List<booksEntity> findByid (int id);
	public List<booksEntity> findByIdAndAuthor (int id,String author);
}
