package co.grandcircus.gcuniversity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.gcuniversity.dao.AdminDao;
import co.grandcircus.gcuniversity.dao.StudentDao;
import co.grandcircus.gcuniversity.entity.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	AdminDao adminDao;
	
	@RequestMapping("/student-courses")
	public ModelAndView studentCourses (Student student) {
		ModelAndView mav = new ModelAndView("student-courses");
		return mav;
	}
	
	@RequestMapping("/student-enroll")
	public ModelAndView studentEnroll () {
		ModelAndView mav = new ModelAndView("student-enroll");
		return mav;
	}
	

}
