package com.cyz.controller;

import com.cyz.bean.Admin;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;
import com.cyz.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class Admincontroller {
    @Autowired
    private AdminServiceImpl adminService;

    @ResponseBody
    @RequestMapping("/aupdatePassword")
    public String tupdatePassword(int aid,String password){
        adminService.updatePasswordByaId(aid,password);
        return "";
    }
    @ResponseBody
    @RequestMapping("/findAllteacher")
    public List<Teacher> findAllteacher(){
        List<Teacher> allTeacher = adminService.findAllTeacher();
        return allTeacher;
    }
    @ResponseBody
    @RequestMapping("/afindSelf")
    public Admin findSelf(int aid){
        Admin selfMsg = adminService.selectSelf(aid);
        return selfMsg;
    }
    @ResponseBody
    @RequestMapping("/addteacher")
    public String addteacher(String tname,String tpassword){
        adminService.addTeacher(tname,tpassword);
        return "";
    }
    @ResponseBody
    @RequestMapping("/findAllstudent")
    public List<Student> findAllstudent(){
        List<Student> allStudent = adminService.findAllStudent();
        return allStudent;
    }
    @ResponseBody
    @RequestMapping("/addstudent")
    public String addstudent(String sname,String spassword){
      adminService.addStudent(sname,spassword);
        return "";
    }
}
