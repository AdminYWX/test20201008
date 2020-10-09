package com.bjpowernode.controller;


import com.bjpowernode.domain.Students;
import com.bjpowernode.exception.NameException;
import com.bjpowernode.service.StudentsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    @Resource
    private StudentsService studentsService;
    //登录权限验证（异常统一管理）
    @RequestMapping(value = "/ex.do")
    public ModelAndView exceptions(String name,Integer age) throws NameException {
        ModelAndView mv = new ModelAndView();
        if (!"Admin".equals(name) && !"123456".equals(age)){
            throw  new NameException("用户错误,权限不足");
        }
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("zy");
        return mv;
    }
    //添加方法
    @ResponseBody
    @RequestMapping(value = "/addstudent.do",method = RequestMethod.POST,
                    produces = "text/plain;charset=utf-8")
    public String StudentAdd(Students student){
        String outResp = "注册失败！";
        int nums = studentsService.addStudent(student);
        if (nums >0){
            outResp="学生【"+ student.getName()+"】注册成功！";
        }
        return outResp;
    }
    //查询方法
    @ResponseBody
    @RequestMapping(value = "/seleStudents.do",method = RequestMethod.POST)
    public List<Students> StudentSele(){
        List list = new ArrayList();
        list = studentsService.selectStudent();
        return list;
    }
    //请求转发与重定向
    @RequestMapping(value="/que.do")
    public ModelAndView Querty(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","法外狂徒憨八龟");
        mv.addObject("age","18888");
        mv.setViewName("forward:/static/jsp/Que.jsp");
        return mv;
    }
    @RequestMapping(value="/que2.do")
    public ModelAndView Querty1(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","法外狂徒懒洋洋");
        mv.addObject("age","188");
        mv.setViewName("redirect:/static/jsp/Que2.jsp");
        return mv;
    }
}
