package mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
