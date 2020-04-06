
package com.houjun.mapper;

import com.houjun.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM base_employee  ")
    List<Employee> listEmp( );
}
