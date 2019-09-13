package com.cyz.service;

import com.cyz.bean.Course;
import com.cyz.bean.Stu_course;
import com.cyz.bean.Student;


import java.util.List;

public interface StudentService {
    List<Student> selectAll();

    Student findSelf(int sid);

    void updatePassword(int sid,String spassword);

    List<Stu_course> findSelectedCourse(int sid);

    List<Course> findAllCourse();

    void addCourse(Stu_course stu_course);
   Course findCourseByid(int cid);
}
