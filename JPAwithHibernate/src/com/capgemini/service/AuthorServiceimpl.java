package com.capgemini.service;

import com.capgemini.dao.AuthorDao;
import com.capgemini.dao.AuthorDaoimpl;
import com.capgemini.entity.Author;

public class AuthorServiceimpl implements AuthorService {

	private AuthorDao dao;
	
	public AuthorServiceimpl()
	{
		dao=new AuthorDaoimpl();
	}
	
	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.deleteAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAuthor(author);
          dao.commitTransaction();
	}

	@Override
	public Author findAuthorById(int id) {
		// TODO Auto-generated method stub
		Author author=dao.findAuthorById(id);
		return author;
	}

	
}
