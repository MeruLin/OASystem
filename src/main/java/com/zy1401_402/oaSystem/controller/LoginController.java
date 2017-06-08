package com.zy1401_402.oaSystem.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy1401_402.oaSystem.entity.person;

@Controller
public class LoginController {	
	@RequestMapping("/login")
	public String index(person per_login,Model model){
		String msg      = "";  
		String id       = per_login.getPersonId();
		String password = per_login.getPersonPassword();
		
		UsernamePasswordToken token = new UsernamePasswordToken(id, password);  
		token.setRememberMe(true);  
		Subject subject = SecurityUtils.getSubject();  
	    try {  
	        subject.login(token);  
	        if (subject.isAuthenticated()) {
	            return "success";  
	        } else {  
	            return "index";  
	        }  
	    } catch (IncorrectCredentialsException e) {  
	        msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";  
	        model.addAttribute("message", msg);  
	    } catch (ExcessiveAttemptsException e) {
	        msg = "登录失败次数过多";  
	        model.addAttribute("message", msg);  
	    } catch (LockedAccountException e) {
	        msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";  
	        model.addAttribute("message", msg);  
	    } catch (DisabledAccountException e) {  
	        msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (ExpiredCredentialsException e) {  
	        msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";  
	        model.addAttribute("message", msg);  
	    } catch (UnknownAccountException e) {  
	        msg = "帐号不存在. There is no user with username of " + token.getPrincipal();  
	        model.addAttribute("message", msg);  
	    } catch (UnauthorizedException e) {  
	        msg = "您没有得到相应的授权！" + e.getMessage();  
	        model.addAttribute("message", msg);  
	    }  
	    return "index";
    }
}
