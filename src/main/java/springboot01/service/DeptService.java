package springboot01.service;

import com.alibaba.fastjson.JSONObject;
import springboot01.entity.Dept;
import springboot01.util.JsonMessage;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-11-08 11:57
 */
public interface DeptService {

    public List<Dept> findAll();
}
