package com.stylepopz.app.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

import com.stylepopz.app.model.User;
import com.stylepopz.app.model.UserPreferences;
import com.stylepopz.app.model.UserProfile;
import com.stylepopz.app.service.UserService;
 
@Controller
public class UserController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
    @Autowired
    private UserService userService;


//	@RequestMapping(value="/addUser.htm", method=RequestMethod.POST)
//	public ModelAndView addUser(HttpServletRequest req, Errors errors)
//	{
//		User u = new User();
//		Integer id = new Integer(req.getParameter("id"));
//		u.setId(new Integer(req.getParameter("id")));
//		u.setToken("token");
//		
//		if (errors.hasErrors())
//		{
//			ModelAndView mav = new ModelAndView("addUser");
//			mav.addObject("errors", errors);
//			return mav;
//		}
//		
//		sessionFactory.getCurrentSession().save(u);
//		
//		if("null".equals(req.getParameter("<email>"))){
//			updateUser(req,id);
//		
//		}
//		
//		return new ModelAndView("redirect:/allUsers.htm");
//	}
	
	
	private void updateUser(HttpServletRequest req,Integer id) {
		UserProfile user = new UserProfile();
        user.setEmail(req.getParameter("email"));
        user.setGender(req.getParameter("gender"));
        user.setName(req.getParameter("name"));
        user.setId(id);
		sessionFactory.getCurrentSession().save(user);
	}
	
	@RequestMapping(value="/updateUserPreferences.htm", method=RequestMethod.POST)
	public ModelAndView updateUser(HttpServletRequest req, Errors errors)
	{
		UserPreferences userPref = new UserPreferences();
		
		
		String preferences = (req.getParameter("pref"));
		
		userPref.setId(new Integer(req.getParameter("id")));
		userPref.setPreferences(preferences);
		
		if (errors.hasErrors())
		{
			ModelAndView mav = new ModelAndView("updateUserPreferences");
			mav.addObject("errors", errors);
			return mav;
		}
		
		sessionFactory.getCurrentSession().save(userPref);
		return new ModelAndView("redirect:/allUsers.htm");
	}

	@RequestMapping(value="/addUser.htm")
	public String addUser()
	{
		return "addUserProfile";
	}

	
	
	@RequestMapping("/allUsers.htm")
	public ModelAndView allUsers()
	{
		List<UserProfile> userProfiles = sessionFactory.getCurrentSession().
			createQuery("FROM UserProfile").list();
		
		ModelAndView mav = new ModelAndView("allUsers");
		mav.addObject("userProfiles", userProfiles);
		return mav;
	}
 
    @RequestMapping("/list.htm")
    public String listContacts(Map<String, Object> map) {
 
        map.put("contact", new UserProfile());
        map.put("contactList", userService.listUser());
 
        return "allUsers";
    }
 

    @RequestMapping(value = "/addUser.htm", method = RequestMethod.POST)
    public ModelAndView addContact(@ModelAttribute("userProfile")
    UserProfile contact, HttpServletRequest req,BindingResult result) {
 
		UserProfile user = new UserProfile();
        user.setEmail(req.getParameter("email"));
        user.setGender(req.getParameter("gender"));
        user.setName(req.getParameter("name"));
        
        System.out.println("User Email: "+user.getEmail());
        System.out.println("User Gender: "+user.getGender());
        System.out.println("User Name: "+user.getName());
        
    	userService.addUser(contact);
    	return new ModelAndView("redirect:/allUsers.htm");
       // return "allUsers";
    }
 
    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId")
    String contactId) {
 
    	userService.removeUser(contactId);
 
        return "redirect:/index";
    }
}
