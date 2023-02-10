package com.chenxing.controller;

import com.chenxing.domain.Stu;
import com.chenxing.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StuController
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 01/02/2023 13:25
 */
@Controller
public class StuController {

    @Resource
    private StuService stuService;

    @RequestMapping("/")
    public String index(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(Model model){

        List<Stu> stuList = stuService.findAll();

        model.addAttribute("stuList",stuList);

        return "index";
    }

    @RequestMapping("/add")
    public String add(){
        System.out.println("调用添加页面");
        return "add";
    }

    @RequestMapping("/insert")
    public String insert(Stu stu){
        System.out.println("insert() is running ...");
        stuService.insert(stu);
        System.out.println("insert() run end ...");

        return "redirect:/index";
    }

    @RequestMapping("/edit")
    public String edit(Model model, int id){
        System.out.println("edit() is running ...");
        Stu stu = stuService.findById(id);
        model.addAttribute("stu", stu);
        System.out.println("edit() run end ...");
        return "edit";
    }

    @RequestMapping("/update")
    public String update(Stu stu){
        System.out.println("update() is running ...");
        stuService.update(stu);
        System.out.println("update() run end ...");

        return "redirect:/index";
    }

    @RequestMapping("/deleteById")
    public String deleteById(int id){
        System.out.println("deleteById() is running ...");
        stuService.deleteById(id);
        System.out.println("deleteById() run end ...");

        return "redirect:/index";
    }




}
