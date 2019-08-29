package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public interface BookDao {
	@Select("select book.*,type.name typename from book inner join type on type.id=book.typeid ${txt} ")
	public List<Book> select(@Param("txt") String txt);
}
