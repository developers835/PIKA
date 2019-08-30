package service;
  
import java.util.List;

import model.Book;

public interface BookService {
public List<Book> select(String txt);
	
	public Book selectById(int id);
	
	public void insert(Book b);
	
	public void delete(int id);
	
	public void update(Book b);
}
