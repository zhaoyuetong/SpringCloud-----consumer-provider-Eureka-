package com.study.spring.cloud.api;

import com.study.spring.cloud.entity.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("study-provider")
public interface EmployeeRemoteService {
    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote();

    @RequestMapping("/provider/get/employee/by/id")
    public Employee getEmployeeById(@RequestParam("empId") Integer empId);
}