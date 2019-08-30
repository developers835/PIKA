package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Book;
import service.BookService;
import service.TypeService;

@Controller
@RequestMapping("Book")
public class BookController {

	@Autowired
	BookService service;
	@Autowired
	TypeService tservice;
	
	@ExceptionHandler
	public void ex(Exception e) {
		e.printStackTrace();
	}
	
	@RequestMapping("index")
	public String index(String txt,ModelMap m) {
		if(txt!=null) txt=" where book.name like '%"+txt+"%' ";
		else txt=" ";
		m.put("list", service.select(txt));
		return "Book/index";
	}
	@RequestMapping("add")
	public String add(ModelMap m){
		m.put("tlist", tservice.select());
		m.put("sexs",Book.sexs);
		return "Book/edit";
	}
	@RequestMapping("edit")
	public String edit(int id,ModelMap m) {
		m.put("info", service.selectById(id));
		return add(m);
	}
	@RequestMapping("insert")
	public String insert(Book b,ModelMap m) {
		service.insert(b);
		return index(null, m);
	}
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
		service.delete(id);
		return index(null, m);
		}
	@RequestMapping("update")
	public String update(Book b,ModelMap m) {
		m.put("sexs", Book.sexs);
		service.update(b);
		return index(null, m);
		}
}
