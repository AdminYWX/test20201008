package com.bjpowernode.advice;

import com.bjpowernode.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@ControllerAdvice
public class MyExceptionAdvice {
    @ExceptionHandler(value = NameException.class)
    public ModelAndView ex(Exception exception){
        ModelAndView mv = new ModelAndView();
        Date data = new Date();
        mv.addObject("time",data);
        mv.addObject("nameEx","姓名异常");
        mv.addObject("ex",exception);
        mv.setViewName("nameError");
        return mv;
    }
}
