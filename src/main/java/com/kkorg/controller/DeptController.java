package com.kkorg.controller;

import com.kkorg.pojo.Dept;
import com.kkorg.pojo.Result;
import com.kkorg.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 部门管理Controller
 */
@Slf4j
@RestController
@RequestMapping("depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 新增部门
     * @return Result
     */
    @GetMapping
    public Result list() {
        log.info("查询所有部门信息");
        List<Dept> deptList =  deptService.list();
        return Result.success(deptList);
    }

    /**
     * 删除部门
     * @param id 部门id
     * @return Result
     */
    @DeleteMapping("/{id}")
    public  Result delete(@PathVariable Integer id) {
        log.info("删除id={}的数据",id);
        deptService.delete(id);
        return  Result.success();
    }

    /**
     * 新增部门
     * @param dept dept
     * @return Result
     */
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门：{}",dept);
        deptService.add(dept);
        return  Result.success();
    }

    /**
     * 修改部门
     * @param dept dept
     * @return Result
     */
    @PutMapping
    public Result update(@RequestBody Dept dept) {
        log.info("修改部门, {}",dept );
        deptService.update(dept);
        return Result.success();
    }

}
