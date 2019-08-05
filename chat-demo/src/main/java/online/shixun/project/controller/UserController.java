package online.shixun.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import online.shixun.project.model.UserModel;
import online.shixun.project.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserService messageService;
	
	@RequestMapping(value ="")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value="sendMessage")
	public String sendMessage(@ModelAttribute UserModel messageModel,Model model) {
		// 消息对象实例化并存入数据库
		userService.saveMessage(messageModel);
		
		// 返回数据库中的消息记录
		List<UserModel> list = messageService.getMessage();
		model.addAttribute("messageList",list);
		return "hello";
	}
}
