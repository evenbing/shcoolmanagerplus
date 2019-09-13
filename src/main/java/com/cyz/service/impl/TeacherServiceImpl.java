package com.cyz.service.impl;

import com.cyz.bean.Course;
import com.cyz.bean.Stu_course;
import com.cyz.bean.Student;
import com.cyz.bean.Teacher;
import com.cyz.dao.TeacherMapper;
import com.cyz.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    @Override
    public Teacher findSelf(int tid) {
        return teacherMapper.findSelf(tid);
    }

    @Override
    public void updatePassword(int tid, String tpassword) {
        teacherMapper.updatePassword(tid,tpassword);
    }

    @Override
    public List<Course> findAllCourse() {
        return teacherMapper.findAllCourse();
    }

    @Override
    public void addCourse(String cname, String cmsg) {
teacherMapper.addCourse(cname,cmsg);
    }

    @Override
    public List<Student> findAllStudent() {
        return teacherMapper.findAllStudent();
    }

    @Override
    public List<Stu_course> findSelectedCourseBySid(int sid) {
        return teacherMapper.findSelectedCourseBySid(sid);
    }

    @Override
    public void updateGrade(int sid,int cid, int cgrade) {
       teacherMapper.updateGrade(sid,cid,cgrade);
    }
}
