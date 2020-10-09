package com.bjpowernode.service;

import com.bjpowernode.domain.Students;

import java.util.List;

public interface StudentsService {
    //新增方法
    int addStudent(Students student);
    //查询方法
    List<Students> selectStudent();
}
