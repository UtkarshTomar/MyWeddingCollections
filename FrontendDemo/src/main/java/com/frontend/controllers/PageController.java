package com.frontend.controllers;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlineshop.backendproject.Category;
import com.onlineshop.backendproject.User;
import com.onlineshop.backendproject.Daos.CategoryDao;
import com.onlineshop.backendproject.Daos.UserDao;


@Controller
public class PageController {
	
	@Autowired
    HttpSession session;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	UserDao userdao;
	
	  @Autowired
	    HttpServletRequest request;
	
	 @RequestMapping(value="/",method=RequestMethod.GET)
	    public ModelAndView getHomePage(){
	        
		 List<Category> catList=categoryDao.getAllCategories();
	         
	        Principal principal = request.getUserPrincipal();
	        System.out.println("PRINCIPAL IS  NOT ACTIVE " + principal);
	        if(principal!=null){
	            String userEmail = principal.getName();
	            System.out.println("PRINCIPAL IS ACTIVE " + userEmail);
	            User user=userdao.getUser(userEmail);
	            System.out.println("Object of User = "+user);
	            session.setAttribute("userName", user.getName());
	            session.setAttribute("userEmail", user.getEmail());
	        }
	        ModelAndView mv=new ModelAndView("Home");
	        session.setAttribute("catList",catList);
	        return mv;
	}
	
	 @RequestMapping(value="/aboutUs",method=RequestMethod.GET)
	 public String toString(){
		 return "AboutUs";
	 }
	 
	@RequestMapping(value="/admin/getProductPage",method=RequestMethod.GET)
	public String getProductOptionsPage(){
		return "ProductOptions";
	}
	
	@RequestMapping(value="/admin/getCatagoryPage",method=RequestMethod.GET)
	public String getCategoryOptionsPage(){
		return "CatagoryOptions";
	}
	
	@RequestMapping(value="/admin/getSupplierPage",method=RequestMethod.GET)
	public String getSupplierOptionsPage(){
		return "SupplierOptions";
	}
	
@RequestMapping(value="/getSignUpForm",method=RequestMethod.GET)
public ModelAndView getSignUp(){
ModelAndView mv=new ModelAndView("SignUpForm");
mv.addObject("userObj",new User());
return mv;
}



@RequestMapping(value="/registerUser",method=RequestMethod.POST)
public ModelAndView registerUser(@ModelAttribute("userObj")User user){
	
ModelAndView mv=new ModelAndView("login");
user.setRole("USER");
userdao.registerUser(user);
return mv;
}


@RequestMapping(value="/login",method=RequestMethod.GET)
public ModelAndView getLoginForm(@RequestParam(name="error",required=false)String error,
		@RequestParam(name="logout",required=false)String logout){
	System.out.println("I m in getLogin Form method");
	ModelAndView mv=new ModelAndView("login");
	if(error!=null){
		mv.addObject("errorMsg","Username or password is incorrect");
	}
	if(logout!=null){
		mv.addObject("errorMsg","User has succesfully logged out!!");
	}
	
	return mv;
}

@RequestMapping(value="/access-denied")
public ModelAndView accessDenied() {
	ModelAndView mv = new ModelAndView("error");		
	mv.addObject("errorMsg", "You are not authorized to access this page");		
	return mv;
}
@RequestMapping(value="/doLogout")
public String loggingOut(HttpServletResponse response) {
     
    Authentication auth=SecurityContextHolder.getContext().getAuthentication();
    if(auth!=null){
        new SecurityContextLogoutHandler().logout(request, response, auth);
    }
    return "redirect:login?logout";
     
}
@RequestMapping(value="dologout")
public String logout(HttpServletRequest request,HttpServletResponse response) {
	
	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	if(auth!=null){
		new SecurityContextLogoutHandler().logout(request, response, auth);
		
	}
	return "redirect:/login?logout";
}
}

