package com.javaEdu.Board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaEdu.Board.di.BController_Service;

@Controller
public class BController {
	
	@Autowired
	@Qualifier("BController_Service")
	BController_Service cs;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list method");
		cs.getListService().execute(model);
		return "Board/list";
	}

	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view method");
		return "Board/write_view";
	}

	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write method");
		model.addAttribute("request", request);
		cs.getWriteService().execute(model);
		return "redirect:list";
	}

	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view method");
		model.addAttribute("request", request);
		cs.getContentService().execute(model);
		return "Board/content_view";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify method");
		model.addAttribute("request", request);
		cs.getModifyService().execute(model);
		return "redirect:list";
	}

	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view method");
		model.addAttribute("request", request);
		cs.getReplyViewService().execute(model);
		return "Board/reply_view";
	}

	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply method");
		model.addAttribute("request", request);
		cs.getReplyService().execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete method");
		model.addAttribute("request", request);
		cs.getDeleteService().execute(model);
		return "redirect:list";
	}
}




