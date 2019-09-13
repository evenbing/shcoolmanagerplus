package com.cyz.controller;
import com.cyz.bean.Course;
import com.cyz.bean.Stu_course;
import com.cyz.bean.Student;
import com.cyz.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class Studentcontroller {
    @Autowired
    private StudentServiceImpl studentService;

    @ResponseBody
    @RequestMapping("/sfindSelf")
    public Student findSelf(int sid){
        Student self = studentService.findSelf(sid);
        return self;
    }
    @ResponseBody
    @RequestMapping("/findSelectedCourse")
    public List<Stu_course> findSelectedCourse(int sid){
        List<Stu_course> selectedCourse = studentService.findSelectedCourse(sid);
        return selectedCourse;
    }
    @ResponseBody
    @RequestMapping("/findCourse")
    public List<Course> findCourse(){
        List<Course> allCourse = studentService.findAllCourse();
        return allCourse;
    }
    @ResponseBody
    @RequestMapping("/updatePassword")
    public void updatePassword(int sid,String password){
        studentService.updatePassword(sid,password);
    }
    @ResponseBody
    @RequestMapping("/joinstudy")
    public String joinstudy(int sid,int cid){
        Student self = studentService.findSelf(sid);
        Course courseByid = studentService.findCourseByid(cid);
        Stu_course stu_course=new Stu_course();
        stu_course.setSid(self.getSid());
        stu_course.setSname(self.getSname());
        stu_course.setCid(courseByid.getCid());
        stu_course.setCname(courseByid.getCname());
        studentService.addCourse(stu_course);
        return "";
    }
}
