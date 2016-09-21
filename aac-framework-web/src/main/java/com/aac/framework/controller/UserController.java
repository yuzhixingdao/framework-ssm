package com.aac.framework.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aac.framework.dto.PageDTO;
import com.aac.framework.entity.MUser;
import com.aac.framework.service.MUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private MUserService muserService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String username, String password) {
		
		MUser user = muserService.login(username, password);
		
		if (user != null) {
			return "index.jsp";
		} else {
			return "login.jsp";
		}
		
	}
	
	@RequestMapping(value="/editInfo")
	public String editInfo(String id, Model model) {
		MUser user = muserService.getUser(id);
		model.addAttribute("user", user);
		return "view/user_edit.jsp";
	}
	
	@RequestMapping(value="/editSubmit", method=RequestMethod.POST)
	public String editSubmit(MUser user, Model model) {
		if (user != null && user.getId() != null && !"".equals(user.getId())) {
			user = muserService.updateUser(user);
			return "redirect:/user/queryPage";
		} else {
			model.addAttribute("user", user);
		}
		return "view/user_edit.jsp";
	}
	
	@RequestMapping(value="/queryPage")
	public String queryPageUser(MUser user, PageDTO page, Model model) {
		Map<String, Object> map = muserService.getUserPage(user, page.getPageNum(), page.getPageSize());
		model.addAttribute("page", map);
		model.addAttribute("user", user);
		return "view/user_page.jsp";
	}
	
	@RequestMapping(value="/queryInfo")
	public String queryInfoUser(String id, Model model) {
		MUser user = muserService.getUser(id);
		model.addAttribute("user", user);
		return "view/user_info.jsp";
	}
	
}
