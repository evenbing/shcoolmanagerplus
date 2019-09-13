package com.cyz.controller;

import com.cyz.bean.Course;
import com.cyz.bean.Stu_course;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;

import com.cyz.service.impl.TeacherServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Teachercontroller {
    @Autowired
    private TeacherServiceImpl teacherService;

    @ResponseBody
    @RequestMapping("/tfindSelf")
    public Teacher findSelf(int tid){
        System.out.println("nihao");
        Teacher self = teacherService.findSelf(tid);
        return self;
    }
    @ResponseBody
    @RequestMapping("/tupdatePassword")
    public void updatePassword(int tid,String password){
        teacherService.updatePassword(tid,password);
    }
    @ResponseBody
    @RequestMapping("/tfindAllCourse")
    public List<Course> tfindAllCourse(){
        List<Course> allCourse = teacherService.findAllCourse();
        return allCourse;
    }
    @ResponseBody
    @RequestMapping("/addCourse")
    public String addCourse(String cname,String cmsg){
        teacherService.addCourse(cname,cmsg);
        return "";
    }
    @ResponseBody
    @RequestMapping("/tfindallstudent")
    public List<Student> tfindallstudent(){
        List<Student> allStudent = teacherService.findAllStudent();
        return allStudent;
    }
    @ResponseBody
    @RequestMapping("/showstudentcourse")
    public List<Stu_course> showstudentcourse(int sid){
        List<Stu_course> findstudentcourse = teacherService.findSelectedCourseBySid(sid);
        return findstudentcourse;
    }
    @ResponseBody
    @RequestMapping("/updategrade")
    public String updategrade(int sid,int cid,int cgrade){
        teacherService.updateGrade(sid,cid,cgrade);
        return "";
    }
}
