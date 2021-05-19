package com.wz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class MyController {
    //定义方法处理请求
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() {
        //调用service对象处理请求，返回数据
        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","处理了some请求");

        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/other.do")
    public ModelAndView doother() {
        //调用service对象处理请求，返回数据
        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","处理了other请求");

        mv.setViewName("show");
        return mv;
    }
}
