package com.company.employeetest.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "EMPLOYEE")
@Entity
public class Employee {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotEmpty(message = "{msg://com.company.employeetest.entity/Employee.firstName.validation.NotEmpty}")
    @Length(message = "{msg://com.company.employeetest.entity/Employee.firstName.validation.Length}", max = 50)
    @InstanceName
    @Column(name = "FIRST_NAME", nullable = false)
    @NotNull
    private String firstName;

    @NotEmpty(message = "{msg://com.company.employeetest.entity/Employee.secondName.validation.NotEmpty}")
    @Length(message = "{msg://com.company.employeetest.entity/Employee.secondName.validation.Length}", max = 50)
    @Column(name = "SECOND_NAME", nullable = false)
    @NotNull
    private String secondName;

    @NotEmpty(message = "{msg://com.company.employeetest.entity/Employee.middleName.validation.NotEmpty}")
    @Length(message = "{msg://com.company.employeetest.entity/Employee.middleName.validation.Length}", max = 50)
    @Column(name = "MIDDLE_NAME", nullable = false)
    @NotNull
    private String middleName;

    @NotEmpty(message = "{msg://com.company.employeetest.entity/Employee.position.validation.NotEmpty}")
    @Length(message = "{msg://com.company.employeetest.entity/Employee.position.validation.Length}", max = 100)
    @Column(name = "POSITION_", nullable = false)
    @NotNull
    private String position;

    @NotEmpty(message = "{msg://com.company.employeetest.entity/Employee.phoneNumber.validation.NotEmpty}")
    @Length(message = "{msg://com.company.employeetest.entity/Employee.phoneNumber.validation.Length}", max = 50)
    @Column(name = "PHONE_NUMBER", nullable = false)
    @NotNull
    private String phoneNumber;

    @Length(message = "{msg://com.company.employeetest.entity/Employee.eMail.validation.Length}", max = 100)
    @NotEmpty(message = "{msg://com.company.employeetest.entity/Employee.eMail.validation.NotEmpty}")
    @Email(message = "{msg://com.company.employeetest.entity/Employee.eMail.validation.Email}")
    @Column(name = "E_MAIL", nullable = false)
    @NotNull
    private String eMail;

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}