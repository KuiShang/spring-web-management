package com.kkorg.mapper;

import com.kkorg.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 员工管理
 */
@Mapper
public interface EmpMapper {
    @Select("select count(*) from db01.emp")
    Long count();

    @Select("select * from  db01.emp limit #{start} , #{pageSize}")
    List<Emp> list(Integer start, Integer pageSize);
}
