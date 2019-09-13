package com.cyz.service;

import com.cyz.bean.Course;
import com.cyz.bean.Stu_course;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;


import java.util.List;

public interface TeacherService {

    List<Teacher> selectAll();
    Teacher findSelf(int tid);
    void updatePassword(int tid, String tpassword);
    List<Course> findAllCourse();
    void addCourse(String cname,String cmsg);
    List<Student> findAllStudent();
    List<Stu_course> findSelectedCourseBySid(int sid);
    void updateGrade(int sid,int cid,int cgrade);
}
