package com.xsy.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 11:33
 * @version:1.0
 **/

@Controller
@RequestMapping("/goto")
public class GotoController {

    @RequestMapping(value = "/frame")
    public String test(Model model) {
        Map<String, Object> map = model.asMap();
        for (String s : map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }

        model.addAttribute("name", "admin");
        model.addAttribute("username", "xsy");
        return "framework/frame";
    }

    @RequestMapping(value = "/top")
    public String top() {
        return "framework/top";
    }

    @RequestMapping(value = "/centre")
    public String right() {
        return "framework/centre";
    }


    @RequestMapping(value = "/left")
    public String left() {
        return "framework/left";
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/stipendAdd")
    public String stipendAdd(){
        return "stipend/stipend_add";
    }

    public String institutionAdd(){
        return "institution/institution_add";
    }

    @RequestMapping("/educateAdd")
    public String educateAdd(){
        return "educate/educate_add";
    }

    @RequestMapping("/jobAdd")
    public String jobAdd(){
        return "job/job_add";
    }

    @RequestMapping("/userAdd")
    public String userAdd(){
        return "user/user_add";
    }

    @RequestMapping("/userList")
    public String userList(){
        return "user/user_list";
    }
}
