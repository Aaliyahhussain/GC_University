package co.grandcircus.gcuniversity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.gcuniversity.dao.CourseDao;
import co.grandcircus.gcuniversity.dao.UserDao;
import co.grandcircus.gcuniversity.entity.Course;
import co.grandcircus.gcuniversity.entity.Student;



@Controller
public class AdminController {
	
	@Autowired
	CourseDao courseDao;
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/admin-courses")
	public ModelAndView adminCourses () {
		ModelAndView mav = new ModelAndView("admin-courses");
		return mav;
	}
	
	@RequestMapping(value="/admin-courses/createCourses", method=RequestMethod.POST)
	public ModelAndView submitCreate(Course course) {
		courseDao.create(course);
		return new ModelAndView("redirect:/admin-courses");
		
	}
	
	@RequestMapping(value="/admin-courses/editCourses", method=RequestMethod.POST)
	public ModelAndView submitEdit(Course course) {
		courseDao.update(course);
		return new ModelAndView("redirect:/admin-courses");
				
	}
	
	@RequestMapping("admin-courses/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		courseDao.delete(id);
		return new ModelAndView("redirect:/admin-courses/delete");
	}
	
				//	Student - create, edit, delete
	
	@RequestMapping(value="/admin-students/createStudents", method=RequestMethod.POST)
	public ModelAndView submitCreate(Student student) {
		userDao.create(student);
		return new ModelAndView("redirect:/admin-students");
		
	}
	
	@RequestMapping(value="/admin-students/editStudents", method=RequestMethod.POST)
	public ModelAndView submitEdit(Student student) {
		userDao.update(student);
		return new ModelAndView("redirect:/admin-students");
				
	}
	
	@RequestMapping("admin-student/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		userDao.delete(id);
		return new ModelAndView("redirect:/admin-students/delete");
	}
	


}
