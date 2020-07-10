package com.xsy.hr.controller;

import com.xsy.hr.bean.Stipend;
import com.xsy.hr.service.IStipendService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Date;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 10:27
 * @version:1.0
 **/
@Controller
@RequestMapping("/stipend")
public class StipendController {

    @Resource
    private IStipendService stipendService;

    @RequestMapping("/add")
    public String getList(Model model, Stipend stipend) {
        //stipend.setCreateTime(new Date(System.currentTimeMillis()));
        System.out.println(stipend);
        Float totalSize = stipend.getBasic() + stipend.getDuty() + stipend.getEat() + stipend.getHouse()
                + stipend.getOther() + stipend.getPunishment() - stipend.getScot();
        stipend.setTotalSize(totalSize);
        stipendService.save(stipend);
        model.addAttribute("hint", "true");
        model.addAttribute("stipendList", stipendService.list());
        return "stipend/stipend_list";
    }

    @RequestMapping("/getList")
    public String getList(Model model) {
        model.addAttribute("stipendList", stipendService.list());
        return "stipend/stipend_list";
    }

    @RequestMapping("/update")
    public String update(Model model, long id) {
        System.out.println(id);
        model.addAttribute("stipend", stipendService.getById(id));
        return "stipend/stipend_update";
    }

    @RequestMapping("/edit")
    public String edit(Model model, Stipend stipend) {
        System.out.println(stipend);
        stipendService.updateById(stipend);
        model.addAttribute("hint", "true");
        model.addAttribute("stipendList", stipendService.list());
        return "stipend/stipend_list";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        stipendService.removeById(id);
        return "/stipend/getList";
    }
}
