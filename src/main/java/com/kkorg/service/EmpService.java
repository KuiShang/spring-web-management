package com.kkorg.service;

import com.kkorg.pojo.Emp;
import com.kkorg.pojo.PageBean;

/**
 * 员工管理
 */
public interface EmpService {
     PageBean<Emp> page(Integer page, Integer pageSize);
}
