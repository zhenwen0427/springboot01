package springboot01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot01.entity.Dept;
import springboot01.service.DeptService;
import springboot01.util.JsonMessage;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-11-08 11:55
 */
@Slf4j
@RestController
public class DeptController {

    @Autowired(required = false)
    private DeptService deptService;

    @ResponseBody
    @RequestMapping("/dept/findAll")
    public JsonMessage findAll(){
        List<Dept> list = deptService.findAll();
        JsonMessage jsonMessage = new JsonMessage(0,list);
        return jsonMessage;
    }

}
