package com.kkorg.mapper;

import com.kkorg.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {
    @Select("select id, name, create_time, update_time from  db01.dept")
    List<Dept> list();

    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into  dept (name,  create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    void insert(Dept dept);

    @Update("update dept set name = #{name}, update_time =  #{updateTime} where id= #{id}")
    void update(Dept dept);
}
