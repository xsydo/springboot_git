package com.xsy.hr.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.xsy.hr.bean.User;
import com.xsy.hr.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 10:27
 * @version:1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(String userName, String password, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_name", userName);
        map.put("password", password);
        List<User> users = (List<User>) userService.listByMap(map);
        String str = "0";
        if (!users.isEmpty()) {
            session.setAttribute("user", users.get(0));
            str = "/goto/frame";
        }
        return str;
    }

    @RequestMapping("/add")
    public String getList(Model model, User user) {
        user.setCreateTime(new Date(System.currentTimeMillis()));
        userService.save(user);
        model.addAttribute("hint", "true");
        model.addAttribute("userList", userService.list());
        return "user/user_list";
    }

    @RequestMapping("/getList")
    public String getList(Model model) {
        model.addAttribute("userList", userService.list());
        return "user/user_list";
    }

    @RequestMapping("/update")
    public String update(Model model, long id) {
        System.out.println(id);
        model.addAttribute("user", userService.getById(id));
        return "user/user_update";
    }

    @RequestMapping("/edit")
    public String edit(Model model, User user) {
        System.out.println(user);
        userService.updateById(user);
        model.addAttribute("hint", "true");
        model.addAttribute("userList", userService.list());
        return "user/user_list";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        userService.removeById(id);
        return "/user/getList";
    }
}
