package crud.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import crud.dao.BookDao;
import crud.model.Book;

@Service
public class BokServiceImpl implements BookService{
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Transactional
	public void addBook(Book book) {
		this.bookDao.addBook(book);
		
	}

	@Transactional
	public void updateBook(Book book) {
		this.bookDao.updateBook(book);
		
	}

	@Transactional
	public void removeBook(int id) {
		this.bookDao.removeBook(id);
		
	}

	@Transactional
	public Book getBookById(int id) {
		return this.bookDao.getBookById(id);
	}

	@Transactional
	public List<Book> listBooks() {
		return this.bookDao.listBooks();
	}
	 

}
