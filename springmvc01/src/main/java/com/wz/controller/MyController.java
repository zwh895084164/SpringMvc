package com.wz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    //定义方法处理请求
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() {
        //调用service对象处理请求，返回数据
        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","处理了some请求");
        //指定视图，setViewName（“视图完整路径”）
        //mv.setViewName("/WEB-INF/view/show.jsp");
        //配置了视图解析器，使用文件名称作为视图名使用，视图逻辑名称
        //使用逻辑名称，框架使用配置文件中的前缀和后缀，拼接出完整的视图路径
        mv.setViewName("show");
        return mv;
    }
}
