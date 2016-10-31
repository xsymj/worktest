/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package com.pdd.controller;

import java.net.MalformedURLException;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caucho.hessian.client.HessianProxyFactory;
import com.pdd.service.UserService;
import com.pdd.user.User;

@Controller
public class UserController{
	
	
	@RequestMapping(value="/select.hessian")
	public Object login() throws MalformedURLException{
		String url = "http://localhost:8080/ppd-service/select.hessian";
		HessianProxyFactory factory = new HessianProxyFactory();
		UserService basic = (UserService) factory.create(UserService.class, url);
		Map<String, Object> user= basic.select("112");
		System.out.println("UserController.login()"+user.get("name"));
		return null;
	}
}