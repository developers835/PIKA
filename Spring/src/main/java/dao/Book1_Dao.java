package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public interface Book1_Dao {
	public List<Book> select(String txt);
}
