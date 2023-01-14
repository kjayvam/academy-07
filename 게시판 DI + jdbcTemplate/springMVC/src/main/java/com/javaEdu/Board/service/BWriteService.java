package com.javaEdu.Board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javaEdu.Board.di.BService_Dao;

@Service
public class BWriteService implements IBService {
	
	@Autowired
	@Qualifier("BService_Dao")
	private BService_Dao dao;
	
	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		dao.getDao().write(bName, bTitle, bContent);
	}
}


