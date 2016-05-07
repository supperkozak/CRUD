package com.crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.crud.model.Book;

@Repository
public class BookDaoImpl implements BookDao {
	
	private static final Logger loger = LoggerFactory.getLogger(BookDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(book);
		loger.info("Book " + book + " saved");
		
	}

	public void updateBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(book);
		loger.info("Book " + book + " updated");
	}

	public void removeBook(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Book book = (Book)session.load(Book.class, new Integer(id));
		
		if(book != null){
			session.delete(book);
		}
		
		loger.info("Book " + book + " deleted");
	}

	public Book getBookById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Book book = (Book)session.load(Book.class, new Integer(id));
		loger.info("Book " + book + " loaded");
		return book;
	}
	
	@SuppressWarnings("unchecked")
	public List<Book> listBooks() { 	
		Session session = this.sessionFactory.getCurrentSession();
		List<Book> bookList = session.createQuery("from book").list();
		
		for(Book book: bookList){
			loger.info("Book " + book);
		}
		
		return bookList;
	}

}
