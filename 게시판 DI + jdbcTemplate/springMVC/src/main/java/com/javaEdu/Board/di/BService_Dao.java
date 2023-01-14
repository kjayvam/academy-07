package com.javaEdu.Board.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javaEdu.Board.dao.IBDao;

@Service
public class BService_Dao {

//	@Qualifier("BDaoMyBitis") 에 대한건 오류가 생기고 있습니다. 문제를 못찾고 있어요.
	@Autowired
	@Qualifier("BDao")
	private IBDao dao;

	public IBDao getDao() {
		return dao;
	}

}
