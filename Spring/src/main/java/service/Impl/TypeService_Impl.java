package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TypeDao;
import model.Type;
import service.TypeService;
@Service
public class TypeService_Impl implements TypeService{
	@Autowired
	TypeDao tdao;
	
	public List<Type> select() {
		
		return tdao.select();
	}

}
