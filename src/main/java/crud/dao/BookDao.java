package crud.dao;

import java.util.List;

import crud.model.Book;

public interface BookDao {
	
	public void addBook(Book book);
	public void updateBook(Book book);
	public void removeBook(int id);
	public Book getBookById(int id);
	public List<Book> listBooks();
	
	

}
