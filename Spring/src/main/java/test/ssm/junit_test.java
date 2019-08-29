package test.ssm;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.Book1_Dao;
import model.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class junit_test {
	@Autowired
	Book1_Dao b;
	
	@Test
	public void select(String txt) {
		List<Book> list=b.select(txt);
	}
	
}
