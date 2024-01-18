package database.testApp.beans;

import java.sql.Date;

public class Employee {

    private Integer employee_id;
    private String employee_name;
    private Double employee_salary;
    private String employee_designation;
    private Date employee_joiningDate;

    public Employee() {
        super();
    }

    public Employee(Integer employee_id, String employee_name, Double employee_salary, String employee_designation, Date employee_joiningDate) {
        super();
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_designation = employee_designation;
        this.employee_joiningDate = employee_joiningDate;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_designation() {
        return employee_designation;
    }

    public void setEmployee_designation(String employee_designation) {
        this.employee_designation = employee_designation;
    }

    public Date getEmployee_joiningDate() {
        return employee_joiningDate;
    }

    public void setEmployee_joiningDate(Date employee_joiningDate) {
        this.employee_joiningDate = employee_joiningDate;
    }

    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_salary="
                + employee_salary + ", employee_designation=" + employee_designation + ", employee_joiningDate="
                + employee_joiningDate + "]";
    }
}