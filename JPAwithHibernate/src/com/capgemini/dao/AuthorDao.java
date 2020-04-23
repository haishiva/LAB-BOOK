package com.capgemini.dao;

import com.capgemini.entity.Author;

public interface AuthorDao {

	public abstract void addAuthor(Author author);
	public abstract void deleteAuthor(Author author);
	public abstract void updateAuthor(Author author);
	public abstract Author findAuthorById(int id);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
