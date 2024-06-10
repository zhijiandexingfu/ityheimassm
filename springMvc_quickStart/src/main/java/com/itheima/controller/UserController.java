package com.itheima.controller;

import com.itheima.entity.MoneyEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("save is executived");
        return "{'module':'User'}";
    }


    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(@RequestParam(value = "userName") String name, int age){
        System.out.println("name is: -->>>" + name);
        System.out.println("age is: -->>>" + age);
        System.out.println("getUser is executived");
        return "{'module':'User getUser'}";
    }

    @RequestMapping("/getMoney")
    @ResponseBody
    public String getMoney(@RequestBody MoneyEntity moneyEntity){
        System.out.println(moneyEntity);
        System.out.println("getMoney is executived");
        return "{'module':'User getMoney'}";
    }

}
