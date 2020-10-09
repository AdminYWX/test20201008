package com.bjpowernode.dao;

import com.bjpowernode.domain.Students;

import java.util.List;

public interface StudentsDao {
    //学生查询
    List<Students> selectStudent();
    //学生新增
    int interlStudent(Students student);
}
