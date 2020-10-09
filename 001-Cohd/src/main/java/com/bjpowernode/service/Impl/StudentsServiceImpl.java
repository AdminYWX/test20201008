package com.bjpowernode.service.Impl;

import com.bjpowernode.dao.StudentsDao;
import com.bjpowernode.domain.Students;
import com.bjpowernode.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "studentsService")
public class StudentsServiceImpl implements StudentsService {
    @Resource
   private StudentsDao studentsDao ;
    @Override
    public int addStudent(Students student) {
       int nums =  studentsDao.interlStudent(student);
        return nums;
    }

    @Override
    public List<Students> selectStudent() {
        List<Students> list = studentsDao.selectStudent();
        return list;
    }
}
