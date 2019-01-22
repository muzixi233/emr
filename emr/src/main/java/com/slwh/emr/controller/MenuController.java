package com.slwh.emr.controller;


import com.slwh.emr.model.Menu;
import com.slwh.emr.service.MenuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("menu")
public class MenuController {
    @Resource
    private MenuService menuService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello springboot";
    }

    @RequestMapping("/insert")
    public int insert(Menu menu){
        return menuService.insert(menu);

    }

    @RequestMapping("/selectById")
    public Menu selectById(Integer mId) {
         return menuService.selectById(mId);
    }
    @RequestMapping("/update")
    public  int update(Menu menu){
        return menuService.update(menu);
    }
    @RequestMapping("/delete")
    public int delete(Integer mId){
        return menuService.delete(mId);
    }
}
