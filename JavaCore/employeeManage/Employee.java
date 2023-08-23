package employeeManage;

import java.io.Serializable;

public class Employee implements Serializable {

    private Integer employeeId;
    private String employeeName;
    private Integer employeeAge;
    private Float employeeSalary;
    private String employeeGender;
    private String employeeDepartment;

    public Employee() {
        super();
    }

    public Employee(Integer employeeId, String employeeName, Integer employeeAge, Float employeeSalary, String employeeGender, String employeeDepartment) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
        this.employeeGender = employeeGender;
        this.employeeDepartment = employeeDepartment;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeSalary=" + employeeSalary +
                ", employeeGender='" + employeeGender + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                '}';
    }
}