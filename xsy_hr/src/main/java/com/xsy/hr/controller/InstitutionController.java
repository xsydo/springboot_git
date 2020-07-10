package com.xsy.hr.controller;

import com.xsy.hr.bean.Institution;
import com.xsy.hr.bean.Institution;
import com.xsy.hr.service.IInstitutionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 10:27
 * @version:1.0
 **/
@Controller
@RequestMapping("/institution")
public class InstitutionController {

    @Resource
    private IInstitutionService institutionService;

    @RequestMapping("/add")
    public String getList(Model model, Institution institution) {
        institution.setCreateTime(new Date(System.currentTimeMillis()));
        System.out.println(institution);
        institutionService.save(institution);
        model.addAttribute("hint", "true");
        model.addAttribute("institutionList", institutionService.list());
        return "institution/institution_list";
    }

    @RequestMapping("/getList")
    public String getList(Model model) {
        model.addAttribute("institutionList", institutionService.list());
        return "institution/institution_list";
    }

    @RequestMapping("/detail")
    public String detail(Model model, long id) {
        model.addAttribute("institution", institutionService.getById(id));
        return "institution/institution_detail";
    }

    @RequestMapping("/update")
    public String update(Model model, long id) {
        System.out.println(id);
        model.addAttribute("institution", institutionService.getById(id));
        return "institution/institution_update";
    }

    @RequestMapping("/edit")
    public String edit(Model model, Institution institution) {
        System.out.println(institution);
        institutionService.updateById(institution);
        model.addAttribute("hint", "true");
        model.addAttribute("institutionList", institutionService.list());
        return "institution/institution_list";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        institutionService.removeById(id);
        return "/institution/getList";
    }
}
