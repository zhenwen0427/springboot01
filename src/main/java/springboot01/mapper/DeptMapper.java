package springboot01.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import springboot01.entity.Dept;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-11-08 11:56
 */
@Mapper
@Repository
public interface DeptMapper {

    public List<Dept> findAll();

}
