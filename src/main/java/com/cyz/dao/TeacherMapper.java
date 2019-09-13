package com.cyz.dao;

import com.cyz.bean.Course;
import com.cyz.bean.Stu_course;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherMapper {


    List<Teacher> selectAll();
    Teacher findSelf(int tid);
    void updatePassword(@Param("tid")int tid,@Param("tpassword")String tpassword);
    List<Course> findAllCourse();
    void addCourse(@Param("cname")String cname,@Param("cmsg")String cmsg);
    List<Student> findAllStudent();
    List<Stu_course> findSelectedCourseBySid(int sid);
    void updateGrade(@Param("sid")int sid,@Param("cid")int cid,@Param("cgrade")int cgrade);
}