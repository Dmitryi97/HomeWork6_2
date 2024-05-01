package pro.sky.homeWork6_2.service;

import org.springframework.stereotype.Service;
import pro.sky.homeWork6_2.exeption.EmployeeAlreadyAddedException;
import pro.sky.homeWork6_2.exeption.EmployeeNotFoundExeption;
import pro.sky.homeWork6_2.exeption.EmployeeStorageIsFullException;
import pro.sky.homeWork6_2.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeService {
    private final int maxEmployee = 15;
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        if (employees.contains(newEmployee)) {
            throw new EmployeeAlreadyAddedException();
        }
        if (employees.size() >= maxEmployee) {
            throw new EmployeeStorageIsFullException();
        }
        employees.add(newEmployee);
        return newEmployee;
    }

    @Override
    public Employee deleteEmployee(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        if (!employees.contains(newEmployee)) {
            throw new EmployeeNotFoundExeption();
        }
        employees.remove(newEmployee);
        return newEmployee;
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        if (!employees.contains(newEmployee)) {
            throw new EmployeeNotFoundExeption();
        }
        return newEmployee;
    }

    public List<Employee> findALL() {
        return Collections.unmodifiableList(employees);
    }
}
