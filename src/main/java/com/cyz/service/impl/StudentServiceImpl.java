package com.cyz.service.impl;

import com.cyz.bean.Course;
import com.cyz.bean.Stu_course;
import com.cyz.bean.Student;
import com.cyz.dao.StudentMapper;
import com.cyz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public Student findSelf(int sid) {
        return studentMapper.findSelf(sid);
    }

    @Override
    public void updatePassword(int sid, String spassword) {
      studentMapper.updatePassword(sid,spassword);
    }

    @Override
    public List<Stu_course> findSelectedCourse(int sid) {
        return studentMapper.findSelectedCourse(sid);
    }

    @Override
    public List<Course> findAllCourse() {
        return studentMapper.findAllCourse();
    }

    @Override
    public void addCourse(Stu_course stu_course) {
      studentMapper.addCourse(stu_course);
    }

    @Override
    public Course findCourseByid(int cid) {
        return studentMapper.findCourseByid(cid);
    }
}
