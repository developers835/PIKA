package service.Impl;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Book1_Dao;
import model.Book;
import service.BookService;

@Service
public class BookService_Impl implements BookService{
	@Autowired
	Book1_Dao dao;

	public List<Book> select(String txt) {
		return dao.select(txt);
	}

}
