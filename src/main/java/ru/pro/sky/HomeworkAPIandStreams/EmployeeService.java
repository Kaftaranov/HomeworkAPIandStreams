package ru.pro.sky.HomeworkAPIandStreams;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import static ru.pro.sky.HomeworkAPIandStreams.HomeworkApIandStreamsApplication.staff;

@Service
public class EmployeeService {
    public Stream<String> allStaff(){
        return staff.stream().map(Employee::toString);
    }

    public Optional<Employee> maxSalaryInDepartment(Integer departmentId) {
        return staff.stream()
                .filter(d -> d.getDepartmentId() == departmentId)
                .max(Comparator.comparingDouble(Employee::getSalary));
    }

    public Optional<Employee> minSalaryInDepartment(Integer departmentId) {
        return staff.stream()
                .filter(d -> d.getDepartmentId() == departmentId)
                .min(Comparator.comparingDouble(Employee::getSalary));
    }

    public String departmentStaff(Integer departmentId) {
        return staff.stream()
                .filter(d -> d.getDepartmentId() == departmentId).toList()
                .toString();
    }
}
