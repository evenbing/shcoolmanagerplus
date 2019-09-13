package com.cyz.dao;

import com.cyz.bean.Admin;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminMapper {

    List<Admin> findAllAdmin();
    Admin selectSelf(int aid);
    void updatePasswordByaId(@Param("aid") int aid,@Param("apassword")String apassword);
    List<Student> findAllStudent();
    List<Teacher> findAllTeacher();
    void addTeacher(@Param("tname")String tname,@Param("tpassword")String tpassword);
    void addStudent(@Param("sname")String sname,@Param("spassword")String spassword);


}