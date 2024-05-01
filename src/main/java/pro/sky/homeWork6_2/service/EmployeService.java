package pro.sky.homeWork6_2.service;

import pro.sky.homeWork6_2.model.Employee;

public interface EmployeService {
    Employee addEmployee(String firstName, String lastName);

    Employee deleteEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);
}
