package com.study.spring.cloud.hander;


import com.study.spring.cloud.api.EmployeeRemoteService;
import com.study.spring.cloud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeFeignHander {
    @Autowired
    private EmployeeRemoteService employeeRemoteService;
    @RequestMapping("/feign/consumer/get/emp")
    public Employee getEmployeeRemote() {
        return employeeRemoteService.getEmployeeRemote();
    }
    @RequestMapping("/feign/consumer/get/emp/id")
    public Employee getEmployeeById(@RequestParam("id") Integer id){
       return employeeRemoteService.getEmployeeById(id);
    }

}