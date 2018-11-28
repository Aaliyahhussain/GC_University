package co.grandcircus.gcuniversity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.gcuniversity.entity.Admin;
import co.grandcircus.gcuniversity.entity.Course;
import co.grandcircus.gcuniversity.entity.User;

@Controller
public class UniversityController {
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView isAdmin(@RequestParam(name="username") String username, @RequestParam(name="password") String password ) {
		// write code to find User based on username and password thru DAO into a variable called user (now is place holder info)
		User user = new Admin(1L, "sarahhale", "whopper", "Sarah", "Hale");
		
		// TODO: check if user exists and if they are admin 
		if (user.isAdmin()) {
			return new ModelAndView("admin-courses");
		} else if (!user.isAdmin()) {
			ModelAndView mav = new ModelAndView("student-courses");
			mav.addObject("message", "Welcome, " + user.getFirstName() + "!");
			// TODO: get method to get all of a user's classes into variable called courseList
			List<Course> courseList = new ArrayList<>();
			mav.addObject("courseList", courseList);
			return mav;
		} else {
			return new ModelAndView("redirect:/", "message", "Sorry, that is not a valid login!");
		}
	}

}
