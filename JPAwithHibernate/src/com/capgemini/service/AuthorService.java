package com.capgemini.service;

import com.capgemini.entity.Author;

public interface AuthorService {

	public abstract void addAuthor(Author author);
	public abstract void deleteAuthor(Author author);
	public abstract void updateAuthor(Author author);
	public abstract Author findAuthorById(int id);
}
