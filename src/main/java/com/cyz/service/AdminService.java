package com.cyz.service;

import com.cyz.bean.Admin;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;


import java.util.List;

public interface AdminService {
    List<Admin> findAllAdmin();
    Admin selectSelf(int aid);
    void updatePasswordByaId(int aid, String apassword);
    List<Student> findAllStudent();
    List<Teacher> findAllTeacher();
    void addTeacher(String tname,String tpassword);
    void addStudent(String sname,String spassword);
}
