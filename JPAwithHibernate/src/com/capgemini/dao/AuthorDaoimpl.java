package com.capgemini.dao;

import javax.persistence.EntityManager;

import com.capgemini.entity.Author;

public class AuthorDaoimpl implements AuthorDao {

	private EntityManager manager;
	
	public AuthorDaoimpl(){
		manager=JPAutils.getEntityManager();
	}
	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		manager.persist(author);
		
	}

	@Override
	public void deleteAuthor(Author author) {
		// TODO Auto-generated method stub
		manager.remove(author);
		
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		manager.merge(author);
	}

	@Override
	public Author findAuthorById(int id) {
		// TODO Auto-generated method stub
		Author author=manager.find(Author.class, id);
		return author;
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		manager.getTransaction().commit();
	}

	
}
