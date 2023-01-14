package com.javaEdu.Board.dao;

import java.util.ArrayList;

import com.javaEdu.Board.model.BVo;

public interface IBDao {
	
	ArrayList<BVo> list();
	void write(String bName, String bTitle, String bContent);
	BVo contentView(String strID);
	void modify(String bId, String bName, String bTitle, String bContent);
	void delete(String bId);
	BVo reply_view(String str);
	void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep, String bIndent);
	void replyShape(String bGroup, String bStep);
	void upHit(String bId);

}
