package com.xsy.hr.controller;

import com.xsy.hr.bean.Job;
import com.xsy.hr.bean.User;
import com.xsy.hr.service.IJobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
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
@RequestMapping("/job")
public class JobController {

    @Resource
    private IJobService jobService;

    @RequestMapping("/add")
    public ModelAndView getList(Model model, Job job) {
        job.setCreateTime(new Date(System.currentTimeMillis()));
        job.setIsStock((byte) 0);
        jobService.save(job);
        model.addAttribute("hint", "true");
        return getList("0");
    }

    @RequestMapping("/getList")
    public ModelAndView getList(String isStock) {
        ModelAndView view = new ModelAndView();
        Map<String, Object> map = new HashMap<>();

        if ("1".equals(isStock)) {
            map.put("is_stock", 1);
        } else {
            map.put("is_stock", 0);
        }
        view.addObject("jobList", jobService.listByMap(map));
        view.setViewName("job/job_list");
        return view;
    }

@RequestMapping("/detail")
    public String detail(Model model, long id) {
        model.addAttribute("job", jobService.getById(id));
        return "job/job_detail";
    }

    @RequestMapping("/storage")
    @ResponseBody
    public String storage(long id) {
        Job job = jobService.getById(id);
        job.setIsStock((byte) 1);
        jobService.updateById(job);
        return "/job/getList";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        Job byId = jobService.getById(id);
        jobService.removeById(id);
        return "/job/getList?isStock="+byId.getIsStock();
    }
}
