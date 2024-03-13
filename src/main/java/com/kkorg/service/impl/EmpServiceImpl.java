package com.kkorg.service.impl;


import com.kkorg.mapper.EmpMapper;
import com.kkorg.pojo.Emp;
import com.kkorg.pojo.PageBean;
import com.kkorg.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageBean<Emp> page(Integer page, Integer pageSize) {
        Long count = empMapper.count();
        Integer start = (page-1) * pageSize;
        List<Emp> empList = empMapper.list(start, pageSize);
        PageBean pageBean = new PageBean<>(count, empList);
        return pageBean;
    }
}
