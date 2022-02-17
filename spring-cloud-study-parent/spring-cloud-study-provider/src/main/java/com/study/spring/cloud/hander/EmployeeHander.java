package com.study.spring.cloud.hander;

import com.study.spring.cloud.entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class EmployeeHander {
    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote(HttpServletRequest request) {
        int port = request.getServerPort();
        return new Employee(555, "tom555"+port, 555.55);
    }
}
