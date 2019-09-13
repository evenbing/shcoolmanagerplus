package com.cyz.service.impl;

import com.cyz.bean.Admin;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;
import com.cyz.dao.AdminMapper;
import com.cyz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> findAllAdmin() {
        return adminMapper.findAllAdmin();
    }

    @Override
    public Admin selectSelf(int aid) {
        return adminMapper.selectSelf(aid);
    }

    @Override
    public void updatePasswordByaId(int aid, String apassword) {
adminMapper.updatePasswordByaId(aid,apassword);
    }

    @Override
    public List<Student> findAllStudent() {
        return adminMapper.findAllStudent();
    }

    @Override
    public List<Teacher> findAllTeacher() {
        return adminMapper.findAllTeacher();
    }

    @Override
    public void addTeacher(String tname, String tpassword) {
adminMapper.addTeacher(tname,tpassword);
    }

    @Override
    public void addStudent(String sname, String spassword) {
         adminMapper.addStudent(sname,spassword);
    }
}
