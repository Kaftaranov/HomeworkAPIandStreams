package ru.pro.sky.HomeworkAPIandStreams;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/departments")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/max-salary")
    public Optional<Employee> maxSalary(@RequestParam("departmentId") Integer departmentId) {
        return (employeeService.maxSalaryInDepartment(departmentId));
    }

    @GetMapping("/min-salary")
    public Optional<Employee> minSalary(@RequestParam("departmentId") Integer departmentId) {
        return (employeeService.minSalaryInDepartment(departmentId));
    }
    @GetMapping("/all")
    public String departmentStaff(@RequestParam("departmentId") Integer departmentId){
        return (employeeService.departmentStaff(departmentId));
    }
    @GetMapping("allstaff")
    public Stream<String> Staff(){
        return (employeeService.allStaff());
    }

}
