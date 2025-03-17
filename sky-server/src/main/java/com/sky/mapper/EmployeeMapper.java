package com.sky.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    //注意驼峰命名法，很重要
    @Insert("insert into employee (name, username, password, phone, sex, id_number, create_time, update_time, create_user, update_user,status)" +
            "values " +
            "(#{name}, #{username}, #{password}, #{phone}, #{sex}, #{idNumber}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser}, #{status})")

    void insert(Employee employee);

    /**
     * 分页查询 持续层实现
     * @param employeePageQueryDTO
     * @return
     */
    //此处需要动态查询，不好直接写查询，在映射文件里写
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用或禁用账号 持续层实现
     * @param employee
     */
    void update(Employee employee);
}
