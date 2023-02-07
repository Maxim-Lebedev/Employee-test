package com.company.employeetest.screen.employee;

import io.jmix.ui.screen.*;
import com.company.employeetest.entity.Employee;

@UiController("Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
public class EmployeeBrowse extends StandardLookup<Employee> {
}