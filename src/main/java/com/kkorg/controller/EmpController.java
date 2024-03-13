package com.kkorg.controller;

import com.kkorg.pojo.Emp;
import com.kkorg.pojo.PageBean;
import com.kkorg.pojo.Result;
import com.kkorg.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 员工管理Controller
 */
@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {

    @Autowired
    private  EmpService empService;
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize) {
        log.info("请求员工数据,{}, {}",page, pageSize);
        PageBean<Emp> pageBean = empService.page(page, pageSize);
        return  Result.success(pageBean);
    }
}
