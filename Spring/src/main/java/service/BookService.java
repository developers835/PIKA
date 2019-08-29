package service;
  
import java.util.List;

import model.Book;

public interface BookService {
	public List<Book> select(String txt);
}
