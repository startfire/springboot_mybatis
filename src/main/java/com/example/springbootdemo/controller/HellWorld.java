package com.example.springbootdemo.controller;


import com.example.springbootdemo.domain.UserName;
import com.example.springbootdemo.mapper.UserNameMapper;
import com.example.springbootdemo.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HellWorld {
@Autowired
private UserNameMapper userNameMapper;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "helloworld";
    }

    @RequestMapping("/test")
    @ResponseBody
    public JsonResponse test(){
        JsonResponse response=JsonResponse.success().setData("aaaaaaaaaaa");
        return response;
    }


    @RequestMapping("/test1")
    @ResponseBody
    public JsonResponse test1(){
        UserName a=userNameMapper.findByName("6666");
        JsonResponse response=JsonResponse.success().setData(a.getName());
        return response;
    }


}
