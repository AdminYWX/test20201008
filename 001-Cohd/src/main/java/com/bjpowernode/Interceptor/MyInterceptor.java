package com.bjpowernode.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//监听器必须实现以下接口
public class MyInterceptor implements HandlerInterceptor {
    //重写三个方法，也可以单独重写所需要用到的方法
    /*
    * 自定义拦截器，需要实现 HandlerInterceptor 接口。而该接口中含有三个方法：
    * preHandle(request,response, Object handler) ：
        该方法在处理器方法执行之前执行。其返回值为 boolean，若为 true，则紧接着会执行处理器方法，
        且会将 afterCompletion()方法放入到一个专门的方法栈中等待执行。
    * postHandle(request,response, Object handler,modelAndView) ：
        该方法在处理器方法执行之后执行。处理器方法若最终未被执行，则该方法不会执行。
        由于该方法是在处理器方法执行完后执行，且该方法参数中包含 ModelAndView，所以该方法可以修
        改处理器方法的处理结果数据，且可以修改跳转方向。
    * afterCompletion(request,response, Object handler, Exception ex) ：
        当preHandle()方法返回 true 时，会将该方法放到专门的方法栈中，等到对请求进行响应的所有
        工作完成之后才执行该方法。即该方法是在中央调度器渲染（数据填充）了响应页面之后执行的，此
        时对 ModelAndView 再操作也对响应无济于事。
        afterCompletion 最后执行的方法，清除资源，例如在 Controller 方法中加入数据
    * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle方法执行了");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle方法执行了");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion方法执行");
    }
}
