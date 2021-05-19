package com.wz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class MyController2 {
    @RequestMapping(value = "/check.do",method = RequestMethod.GET)
    public ModelAndView doCheck() {
        //调用service对象处理请求，返回数据
        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","处理了check-Get请求");

        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/check.do",method = RequestMethod.POST)
    public ModelAndView doSome() {
        //调用service对象处理请求，返回数据
        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","处理了check-Post请求");

        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response,
                                HttpSession session) {
        String name = request.getParameter("name");
        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","处理了check-Post请求"+",name="+name);
        //mv.addObject("name",name);
        mv.setViewName("show");
        return mv;
    }
    //请求参数和方法中参数名一样
    @RequestMapping(value = "/receive.do")
    public ModelAndView do1(String name,Integer age) {
        System.out.println("MyController2.do1");

        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","处理了receive请求");
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("other");
        return mv;
    }
    //请求参数和方法中参数名不一样
    @RequestMapping(value = "/receive-param.do")

    public ModelAndView do2(@RequestParam(value = "n")String name,@RequestParam(value = "a")Integer age) {
        System.out.println("MyController2.do2");

        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","处理了receive-param请求");
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("other");
        return mv;
    }
}
