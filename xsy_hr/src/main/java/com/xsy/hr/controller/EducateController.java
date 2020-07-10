package com.xsy.hr.controller;

import com.xsy.hr.bean.Educate;
import com.xsy.hr.service.IEducateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 10:27
 * @version:1.0
 **/
@Controller
@RequestMapping("/educate")
public class EducateController {

    @Resource
    private IEducateService educateService;

    @RequestMapping("/add")
    public ModelAndView getList(Model model, Educate educate) {
        educate.setCreateTime(new Date(System.currentTimeMillis()));
        educate.setEducate((byte) 0);
        educateService.save(educate);
        model.addAttribute("hint", "true");
        return getList("0");
    }

    @RequestMapping("/getList")
    public ModelAndView getList(String educate) {
        ModelAndView view = new ModelAndView();
        Map<String, Object> map = new HashMap<>();
        System.out.println(educate);
        if ("1".equals(educate)) {
            map.put("educate", 1);
        } else {
            map.put("educate", 0);
        }
        view.addObject("educateList", educateService.listByMap(map));
        view.addObject("educateType", map.get("educate"));
        view.setViewName("educate/educate_list");
        return view;
    }

@RequestMapping("/detail")
    public String detail(Model model, long id) {
        model.addAttribute("educate", educateService.getById(id));
        return "educate/educate_detail";
    }

    @RequestMapping("/storage")
    @ResponseBody
    public String storage(long id) {
        Educate educate = educateService.getById(id);
        educate.setEducate((byte) 1);
        educateService.updateById(educate);
        return "/educate/getList";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        Educate educate = educateService.getById(id);
        educateService.removeById(id);
        return "/educate/getList?isStock="+educate.getEducate();
    }
}
