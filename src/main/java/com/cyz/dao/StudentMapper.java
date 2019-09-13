package com.cyz.dao;

import com.cyz.bean.Course;
import com.cyz.bean.Stu_course;
import com.cyz.bean.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {


    List<Student> selectAll();

    Student findSelf(int sid);

    void updatePassword(@Param("sid")int sid,@Param("spassword")String spassword);

    List<Stu_course> findSelectedCourse(int sid);

    List<Course> findAllCourse();

    void addCourse(Stu_course stu_course);
    Course findCourseByid(int cid);

}