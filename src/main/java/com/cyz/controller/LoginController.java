package com.cyz.controller;
import com.cyz.bean.Admin;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;
import com.cyz.service.impl.AdminServiceImpl;
import com.cyz.service.impl.StudentServiceImpl;
import com.cyz.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private AdminServiceImpl adminService;
    @Autowired
    private TeacherServiceImpl teacherService;
    @ResponseBody
    @RequestMapping("/teacher")
    public String TeacherLogin(String name, String password){
        List<Teacher> teachers = teacherService.selectAll();
        for (Teacher teacher : teachers) {
            if(teacher.getTname().equals(name)&&teacher.getTpassword().equals(password))
            {
                return teacher.getTid().toString();
            }
        }
        return "error";
    }
    @ResponseBody
    @RequestMapping("/student")
    public String StudentLogin(String name,String password){
        List<Student> students = studentService.selectAll();
        for (Student student : students) {
            if(student.getSname().equals(name)&&student.getSpassword().equals(password)){
                return student.getSid().toString();
            }
        }
        return "error";
    }
    @ResponseBody
    @RequestMapping("/admin")
    public String AdminLogin(String name,String password){
        List<Admin> allAdmin = adminService.findAllAdmin();
        for (Admin admin : allAdmin) {
            if (admin.getAname().equals(name)&&admin.getApassword().equals(password))
                return admin.getAid().toString();
        }
         return "error";
    }
    @RequestMapping("/login")
    public String login(String role,int id,Model model){
        if(role.equals("teacher")){
            model.addAttribute("tid",id);
            return "teacher";
        }else if(role.equals("student")){
            model.addAttribute("sid",id);
            return "student";

        }else {
            model.addAttribute("aid",id);
            return "admin";
        }
    }

}
