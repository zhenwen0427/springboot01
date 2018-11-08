package springboot01.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springboot01.entity.Dept;
import springboot01.mapper.DeptMapper;
import springboot01.service.DeptService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2018-11-08 11:57
 */
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
