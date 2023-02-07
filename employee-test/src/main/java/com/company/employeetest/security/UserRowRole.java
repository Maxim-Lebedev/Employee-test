package com.company.employeetest.security;

import com.company.employeetest.entity.Employee;
import com.company.employeetest.entity.User;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

import javax.annotation.Nonnull;

@Nonnull
@RowLevelRole(name = "UserRowRole", code = "user-row-role")
public interface UserRowRole {
    @JpqlRowLevelPolicy(entityClass = Employee.class, where = "{E}.eMail =:current_user_email")
    void employee();

}