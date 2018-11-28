package co.grandcircus.gcuniversity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.gcuniversity.dao.AdminDao;
import co.grandcircus.gcuniversity.dao.StudentDao;
import co.grandcircus.gcuniversity.entity.Admin;
import co.grandcircus.gcuniversity.entity.Course;
import co.grandcircus.gcuniversity.entity.User;

@Controller
public class UniversityController {
	
	@Autowired
	AdminDao adminDao;
	
	@Autowired
	StudentDao studentDao;
	
	@RequestMapping("/")
	public ModelAndView showIndex(HttpSession session) {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView isAdmin(@RequestParam(name="username") String username, 
			@RequestParam(name="password") String password, RedirectAttributes redir,
			HttpSession session) {
		
		try {
			// write code to find User based on username and password thru DAO into a variable called user (now is place holder info)
			User user = adminDao.validateUserExists(username, password);
			
			// check if user exists and if they are admin 
			if (user.isAdmin()) {
				redir.addFlashAttribute("message", "Welcome, " + user.getFirstName() + "!");
				return new ModelAndView("admin-courses");
			} else {
				ModelAndView mav = new ModelAndView("student-courses");
				redir.addFlashAttribute("message", "Welcome, " + user.getFirstName() + "!");
				// TODO: get method to get all of a user's classes into variable called courseList
				List<Course> courseList = studentDao.findAllUserCourses(user);
				mav.addObject("courseList", courseList);
				return mav;
			}
			
		} catch (NoResultException e) {
			redir.addFlashAttribute("message", "Sorry, that is not a valid login!");
			return new ModelAndView("redirect:/");
		}
		
	}
	
}
