package com.blue_dot.web;

import com.blue_dot.stereotype.Component;
import com.blue_dot.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Jason
 * @CreationDate 2023/02/05 - 23:33
 * @Description ：
 */
@Component
@RequestMapping("/my")
public class MyController {
    @RequestMapping("/t01")
    public String test01(){
        return "haha";
    }

    @RequestMapping("/t02")
    public String test02(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return "world hello2222";
    }

    @RequestMapping("/t03")
    public String test03(HttpServletResponse response){
        System.out.println(response.getCharacterEncoding());
        return "world hello333333";
    }

    @RequestMapping("/t4")
    public String test04(HttpServletResponse response, HttpServletRequest request){
        System.out.println(response.getCharacterEncoding());
        System.out.println(request.getRequestURI());
        return "world hello444444444444444";
    }

    @RequestMapping
    public String t05(HttpServletResponse response, HttpServletRequest request){
        System.out.println(response.getCharacterEncoding());
        System.out.println(request.getRequestURI());
        return "world hello555555555555555555555555555555555555";
    }
}
