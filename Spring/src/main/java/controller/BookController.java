package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Book;
import service.BookService;

@Controller 
@RequestMapping("Book")
public class BookController {
	
	@Autowired
	BookService service;
	
	@RequestMapping("index")
	public String select(ModelMap m,String txt){
		if(txt==null) txt=" ";
		else txt=" where book.name like '%"+txt+"%' ";
		m.put("list", service.select(txt));
		return "Book/index";
	}
}
